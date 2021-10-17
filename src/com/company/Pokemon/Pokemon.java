package com.company.Pokemon;

import com.company.Move;
import com.company.Moves;
import com.company.PokemonTrainers.Blaine;
import com.company.PokemonTrainers.GymLeader;
import com.company.PokemonTrainers.GymTrainer;
import com.company.PokemonTrainers.Misty;
import com.company.PokemonType;

import java.util.Random;

public class Pokemon implements Evolution{
    Random rng = new Random();

    public String name;
    public String nickName;
    public String prevEvolution = null;
    public String evolution = null;
    public PokeDex evo2 = null;
    public String rarity = "common";


    public int pokedexID;
    public int height;
    public int weight;
    public double bodyMassIndex;

   public  int evolutionID;

   public  int currentLevel;
    int evolveLevel;

    public double maxHP;
    public double currentHP;
    public double XP = 0;
    public double attack;
    public double specialAttack;
    public double defense;
    public double specialDefense;

    public double currentEnergy = 1;
   public  double maxEnergy = 10;
   public  double energyGainRate;
    PokemonType type;

    public int skillLuck;
    public int geneticLuck;
    public int scenarioLuck;
    public int luck;

    public boolean isShiny = false;
   public  boolean isAlive = true;

    String[] resistances;
    Moves[] moveSet;
    Moves[] currentMoves;


    public Pokemon(){
        //As soon as pokemon object is mad This pokemon blueprint function is ran
        // Everything will happen in subclass so for just name.

        this.geneticLuck =  rng.nextInt(100);
        this.skillLuck = rng.nextInt(100);

        this.luck = (geneticLuck * skillLuck) / 20;
        this.scenarioLuck = rng.nextInt(400) + this.luck;


        this.observeRarity();

    }
    public Pokemon(int geneticLuck, int skillLuck){
        //As soon as pokemon object is mad This pokemon blueprint function is ran
        // Everything will happen in subclass so for just name.

        this.geneticLuck =  geneticLuck;
        this.skillLuck = skillLuck;

        this.luck = (geneticLuck * skillLuck) / 20;
        this.scenarioLuck = rng.nextInt(400) + this.luck;


        this.observeRarity();

    }

    ////////////////////////////////////////////////////Get Set //////////////////////////////////////////////////////////////
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setCurrentLevel(int currentLevel) {

        this.currentLevel = currentLevel;
    }
    public void setXP(double XP) {
        this.XP = XP;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }


    public void setCurrentHP(double currentHP) {
        this.currentHP = currentHP;
    }

    public double getCurrentHP(){
        return currentHP;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////Game Managers///////////////////////////////////////////////////////////////

    public void increaseCurrentHP(double amount) {
        this.currentHP += amount;

        if (currentHP > maxHP){
            currentHP = maxHP;
        }
    }
    public void decreaseCurrentHP(double amount) {
        this.currentHP -= amount;
        if (0 > currentHP){
            currentHP = 0;
        }
    }

    public void calculateDamage(Pokemon origin, Pokemon target, Move m){
        // take in poke consider there special attack / atk
        // take in target consider spc d / defense
        // take in move which has a base atk
        // move dmg is first increased based on origin stats
        // then dmg is modified based on target res
        // get and return final damage calc

    }
    public void levelUP(int levels){
        setCurrentLevel(currentLevel + levels);
        setXP(0);
        this.calulateLevelUpStatChanges();
        observeEvolve();

        System.out.println(nickName + " has leveled up");

    }


    public void basicAttack(Pokemon target){

        double dmgMod = (100/ (100 + target.defense));

        double dmg = dmgMod * this.attack;
        target.decreaseCurrentHP(dmg);
        target.observeHP();


    }

    public void gainEnergy(){
        this.currentEnergy += this.energyGainRate;
    }

    public void increaseXP(double XP) {
        this.XP += XP;
        if (this.XP > 100){
            System.out.println(nickName + " just leveled up");
            levelUP(1);

        }
    }



    ///////////////////////////////////////////Reports ///////////////////////////////////////////////////////////////////////
public void getPokeStats(){
    System.out.println("MaxHP: " + maxHP + " CurrentHP: " +currentHP + "\n Level: " + currentLevel + "XP: " + XP);
    System.out.println("ATK: " + attack + " SpATK: " +specialAttack + "\nDEF: " + defense + " SpDEF: " + specialAttack);
    System.out.println("Genes: " + geneticLuck +" Skills:" + skillLuck);
    System.out.println("Scenario: " + scenarioLuck +" Luck OVR:" + luck);
    System.out.println("Height: " + height+ " Weight: " + weight + "\nBMI " + (int) bodyMassIndex + " Rarity: " + rarity  );
    System.out.println("-----------\n");
}

    public void showEnemyStats(){
        System.out.println( "HP: " +currentHP + " Level " + currentLevel + " BMI " +  bodyMassIndex/12 + "\n Rarity " + rarity);

    }

    public void reportCurrentHP(){
        System.out.println(nickName +"'s HP: " + currentHP);
    }

    public void showBattleHP(){
        System.out.println(this.nickName + "'s hp: " + (int) this.currentHP);
    }



    /////////////////////////////////////////////////Calculators////////////////////////////////////////////////////////

    public static int calculatePokeHeight(int min, int max,int luck){

        // get random number inbetween min and max to determine height
        double height = Math.floor(Math.random() * (max - min + 1) + min);
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.20;

        } else if(luck >=65 && luck < 85){
            factor = 1.35;
        } else if (luck >=85 && luck < 95){
            factor = 1.5;

        }else  if (luck >=95){
            factor = 1.7;
        }

//        System.out.println("Base :" + height + "\n Factor: " + factor + "\n Luck: "+ luck+"\n Final:" + (height * factor));
        return (int) height;

    }

    public static int calculatePokeWeight(int min, int max,int luck){

        // get random number inbetween min and max to determine height
        double weight = Math.floor(Math.random() * (max - min + 1) + min);
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.20;

        } else if(luck >=65 && luck < 85){
            factor = 1.35;
        } else if (luck >=85 && luck < 95){
            factor = 1.5;

        }else  if (luck >=95){
            factor = 1.7;
        }

//        System.out.println("Base :" + weight + "\n Factor: " + factor + "\n Luck: "+ luck+"\n Final:" + (weight * factor));
        return (int) weight;

    }

    public static double calculatePokeBMI(int weight, int height){


//        System.out.println(weight);
//        System.out.println(height);
//        double f = (double) (weight / (height*height));
//        System.out.println(f);
//        double bmi = (f*703);
//        System.out.println(bmi);

        double a = (double) weight / height;

        double factor = (a)/height;



        return factor * 703;
    }

    public static int calculatePokeHP(double bmi, int weight,int luck){
        return (int) (bmi* 2) + weight;
    }
    public static int calculatePokeAtk(double bmi, int luck){
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.20;

        } else if(luck >=65 && luck < 85){
            factor = 1.35;
        } else if (luck >=85 && luck < 95){
            factor = 1.5;

        }else  if (luck >=95){
            factor = 1.7;
        }

        int atk = luck*2;
        return atk;

    }

    protected static double calculatePokeDEF(double bmi, int luck) {
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.20;

        } else if(luck >=65 && luck < 85){
            factor = 1.35;
        } else if (luck >=85 && luck < 95){
            factor = 1.5;

        }else  if (luck >=95){
            factor = 1.7;
        }

        int def = (int) (5 + (bmi * factor));
        return def;
    }

    protected static double calculatePokeSpAtk(int luck) {
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.50;

        } else if(luck >=65 && luck < 85){
            factor = 1.85;
        } else if (luck >=85 && luck < 95){
            factor = 2.5;

        }else  if (luck >=95){
            factor = 2.7;
        }

        int atk = (int) (5 + ( 20 * factor)) ;
        return atk;
    }

    protected static double calculatePokeSpDef(int luck) {
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.20;

        } else if(luck >=65 && luck < 85){
            factor = 1.35;
        } else if (luck >=85 && luck < 95){
            factor = 1.5;

        }else  if (luck >=95){
            factor = 1.7;
        }

        int def = (int) (5 + ( 20 * factor)) ;
        return def;
    }

    protected void calulateLevelUpStatChanges() {
        double factor = 0;
        // if luck 1-4 factor is x

        if (luck <= 35 ){
            factor =1.0;
        } else if  (luck > 35 && luck < 65 ){
            factor = 1.20;

        } else if(luck >=65 && luck < 85){
            factor = 1.35;
        } else if (luck >=85 && luck < 95){
            factor = 1.5;

        }else  if (luck >=95){
            factor = 1.7;
        }

        setAttack(attack *=factor);
        setMaxHP(maxHP *= factor);
        // finish rest of stat changes
    }



    ////////////////////////////////////////////////Observers /////////////////////////////////////////////////////////
    public void observeEvolve(){
        if (currentLevel > evolveLevel){
            this.evolve();
            System.out.println("Congrats " + nickName + " has evolved.");
            this.getPokeStats();
        }
    }

    public void observeHP(){
        if (currentHP <= 0){
            System.out.println("time to die");
            isAlive = false;
            currentHP = 0;
        }

//        if (currentHP > 0 && !isAlive) {
//            isAlive = true;
//            System.out.println("You have been restored");
//        }
    }
    public void observeRarity(){

        if (luck > 400){
            isShiny = true;
            rarity = "legendary";
        } else if (luck > 315){
            rarity = "epic";
        } else if (luck > 215){
            rarity = "rare";
        } else if (luck > 150){
            rarity = "uncommon";
        }
    }



    ////////////////////////////////////////////////ITEMS /////////////////////////////////////////////////////////


    public void useRareCandy(){
        levelUP(1);
    }

    public void useMegaRareCandy(){
        levelUP(3);
    }

    public void useHyperPotion(){
        double heal = getMaxHP() / 2;
        increaseCurrentHP(heal);
    }

    public void usePowerBar(){
        setMaxHP(getMaxHP() + 50);
    }


    //////////////////////////////////////////////// Utility /////////////////////////////////////////////////////////

    public static void rollPokemon(int size){
        Arbok[] pokemon = new Arbok[size];


        int legendCount= 0;
        int epicCount= 0;
        int rareCount= 0;
        int uncommonCount= 0;
        int commonCount= 0;

        for (int i = 0;i < pokemon.length; i++){
            pokemon[i] = new Arbok(100,100);
            pokemon[i].getPokeStats();

            if (pokemon[i].rarity.equals("legendary")){
                legendCount++;

            }

            if (pokemon[i].rarity.equals("epic")){
                epicCount++;
            }
            if (pokemon[i].rarity.equals("rare")){
                rareCount++;
            }
            if (pokemon[i].rarity.equals("uncommon")){
                uncommonCount++;
            }
            if (pokemon[i].rarity.equals("common")){
                commonCount++;
            }


        }
        System.out.println("Legendary: " + legendCount
                +"\nEpic: " + epicCount
                + "\nRare: " + rareCount
                + "\n Uncommon: " + uncommonCount
                + "\n Common: " + commonCount);

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////

/// Here is how i am thinking about arena
//    for now i will try it as an object that takes in two pokemon objects
//            and from there its a gameplay loop of pokemon attackin
//            ideally i want cpu to analyze the damage of all its moves and just use that
//            will also somehow need to implent like a mana bar or something to regulate which move
//            the enemy pokemon uses other wise its always just going to use its most damaging move
//
//            can let user poke auto battle or can user control
//
//            im thinking i can send in the 2 objects and then like re write them idk
//            i feel like thats the OO way to go about it and not the functinos



    public static void main(String[] args) {

//        pp = new Poke

       GymLeader Blaine = new Blaine();
        System.out.println(Blaine);


    }


    @Override
    public Pokemon evolve() {
        System.out.println("This pokemon does not have an evolution.");
        return null;
    }
}
