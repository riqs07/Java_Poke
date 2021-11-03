package com.company.Pokemon;

import com.company.Game.BattleCalculators;
import com.company.Pokemon.Moves.PokeAttacKMove;
import com.company.Pokemon.Types.BattleTypes;
import com.company.Pokemon.Types.PokemonType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class Pokemon implements Evolution {
    Random rng = new Random();

    public UUID uuid = UUID.randomUUID();
    public String name;
    public String nickName;
    public PokeDex prevEvolution = null;
    public PokeDex evolution = null;
    public String rarity = "common";


    public int pokedexID;
    public int height;
    public int weight;
    public double bodyMassIndex;


   public  int currentLevel;
    int evolveLevel;

    public double maxHP;
    public double currentHP;
    public double XP = 0;
    public double attack;
    public double specialAttack;
    public double defense;
    public double specialDefense;
    public double speed;

    public double currentEnergy = 0;
   public  double maxEnergy;
   public  double energyGainRate;
    public  PokemonType attributeType;

    public int skillLuck;
    public int geneticLuck;
    public int scenarioLuck;
    public int luckOVR;

    public boolean isShiny = false;
   public  boolean isAlive = true;

    String[] resistances;

    List<PokeAttacKMove> currentMoves = new ArrayList<>();


    public Pokemon(){
        //As soon as pokemon object is mad This pokemon blueprint function is ran
        // Everything will happen in subclass so for just name.

        this.geneticLuck =  rng.nextInt(100);
        this.skillLuck = rng.nextInt(100);

        this.luckOVR = (geneticLuck * skillLuck) / 20;

        this.observeRarity();

    }
    public Pokemon(int geneticLuck, int skillLuck){
        //As soon as pokemon object is mad This pokemon blueprint function is ran
        // Everything will happen in subclass so for just name.

        this.geneticLuck =  geneticLuck;
        this.skillLuck = skillLuck;

        this.luckOVR = (geneticLuck * skillLuck) / 20;
        this.scenarioLuck = rng.nextInt(400) + this.luckOVR;


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
        checkIfDead();

    }

    public void levelUP(int levels){
        setCurrentLevel(currentLevel + levels);
        setXP(0);
        this.calulateLevelUpStatChanges();
        observeEvolve();

        System.out.println(nickName + " has leveled up");

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
    System.out.println(name);
    System.out.println("MaxHP: " + maxHP + " CurrentHP: " +currentHP + "\n Level: " + currentLevel + "XP: " + XP);
    System.out.println("ATK: " + attack + " SpATK: " +specialAttack + "\nDEF: " + defense + " SpDEF: " + specialAttack);
    System.out.println("Genes: " + geneticLuck +" Skills:" + skillLuck);
    System.out.println("Scenario: " + scenarioLuck +" Luck OVR:" + luckOVR);
    System.out.println("Height: " + height+ " Weight: " + weight + "\nBMI " + (int) bodyMassIndex + " Rarity: " + rarity  );
    System.out.println("-----------\n");
}

    public void showQuickStats() {
        System.out.println( name + "\tHP: " +currentHP + "\nLevel: " + currentLevel + " XP: " + XP);
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





    protected void calulateLevelUpStatChanges() {
        double factor = 0;
        // if luck 1-4 factor is x

        if (luckOVR <= 35 ){
            factor =1.0;
        } else if  (luckOVR > 35 && luckOVR < 65 ){
            factor = 1.20;

        } else if(luckOVR >=65 && luckOVR < 85){
            factor = 1.35;
        } else if (luckOVR >=85 && luckOVR < 95){
            factor = 1.5;

        }else  if (luckOVR >=95){
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

    public void checkIfDead(){
        if (currentHP <= 0){
            isAlive = false;
            currentHP = 0;
        }

//        if (currentHP > 0 && !isAlive) {
//            isAlive = true;
//            System.out.println("You have been restored");
//        }
    }
    public void observeRarity(){

        if (luckOVR > 400){
            isShiny = true;
            rarity = "legendary";
        } else if (luckOVR > 315){
            rarity = "epic";
        } else if (luckOVR > 215){
            rarity = "rare";
        } else if (luckOVR > 150){
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


    @Override
    public Pokemon evolve() {
        System.out.println("This pokemon does not have an evolution.");
        return null;
    }


    public void attack(Pokemon target, int moveIndex){
        PokeAttacKMove selectedMove = currentMoves.get(moveIndex);
        boolean willMiss = BattleCalculators.determineMiss(selectedMove.accuracy);


        if (!willMiss){
            double dmg = BattleCalculators.calculateAttackDamage(target,selectedMove);
            target.decreaseCurrentHP(dmg);
        }


    }





    public void determineAttack(Pokemon target) {
    // Loop thru current moves array
        // which ever has highest dmg possiblity do that
        // if there is enough energy

    }





}

