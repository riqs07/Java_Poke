package com.company.Game;

import com.company.Game.Arena;
import com.company.Game.TravelLocation;
import com.company.Pokemon.*;
import com.company.PokemonTrainers.UserTrainer;

import java.util.Random;
import java.util.Scanner;

public class RPG {


    public static int startUp() {
        Pokemon poke = null;

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Poke-RPG! \n Please Select your Diffuculty. Medium is the Defualt. \n 1.Easy 2.Medium 3.Hard 4.Very Hard  \n");
        return s.nextInt();

    }


    public static Pokemon determineBattleOpponent(String area,int difficulty) {
        // diffrent rates based on area

        Pokemon enemy = null;


        Random rng = new Random();
        int roll = rng.nextInt(15);





        int genes =0;
        int skills= 0;

        switch (difficulty){
            // can even make it get a certain number in range will leave these in for now
            case 1:
                genes = 35;
                skills = 40;

            case 3:
                genes = 65;
                skills = 60;
            case 4:
                genes = 90;
                skills = 90;
        }




        if (roll > 0) {

            enemy = new Charmander();
        }

        if (roll > 5 && roll <= 9) {
            enemy = new Arbok(genes, skills);
        } else if (roll >= 10) {


            enemy = new Arbok(genes, skills);
        }


        return enemy;
    }

    public static Pokemon determineBattleOpponent2(TravelLocation location){

        Random rng = new Random();
        int roll = rng.nextInt(10);
        Pokemon enemy = null;
        if (location == TravelLocation.GRASSLANDS){
            if (roll > 0) {
                enemy = new Charmander();
            }

            if (roll > 5 && roll <= 9) {
                enemy = new Arbok(50, 50);
            } else if (roll >= 10) {
                enemy = new Arbok(70, 70);
            }
        } else if (location == TravelLocation.BEACH){
            if (roll > 0) {
                enemy = new Starmie();
            }
            if (roll > 5 && roll <= 9) {
                enemy = new Starmie(50, 50);
            } else if (roll >= 10) {
                enemy = new Staryu(70, 70);
            }

        }


        return enemy;

    }

//    public static EnemyTrainer determineTrainerOpponent(TravelLocation location){
//
//    }

    public static void game(int startDiffuclty, int pokeSelect) {
        /// Need to check if integers are good
        // for now we move on
        int gold = 0;
        int gameDiffuclty = startDiffuclty;
        Random rng = new Random();

        Scanner sc = new Scanner(System.in);


        Pokemon poke = null;

        if (pokeSelect == 1) {
            poke = new Charmander();
        }

        if (pokeSelect == 2) {
            poke = new Arbok(100,100);

        }

        System.out.println("Congrats on your new " + poke.name + "\n Would you like to give them a name? \n Type their name or type no.");
        String res = sc.nextLine();

        if (!res.equalsIgnoreCase("no") || !res.equals("")) {
            poke.nickName = res;
        }


        System.out.println("Please Press Enter to begin the Game. Type Quit when you are done playing. ");
        res = sc.nextLine();


        ////////////////// GAME LOOP ////////////////


        do {
            System.out.print("-----------------------\n"
                    + "What do you want to do?\n"
                    + "Battle | Gym | Items | Skills | Stats | Shop |\nRest | Travel | PokeDex | Help | Difficulty\n");
            res = sc.nextLine();

            if (res.equalsIgnoreCase("Items")) {
                System.out.println("Which Item? 1.Hyper Potion 2.Rare Candy 3. Mega rare Candy 4. Potion 5. PowerBar");
                int select = sc.nextInt();


                switch (select) {
                    case 1:
                        poke.useHyperPotion();
                        break;
                    case 2:
                        poke.useRareCandy();
                        break;
                    case 3:
                        poke.useMegaRareCandy();
                        break;
                    case 4:
                        poke.usePowerBar();
                        break;

                }

            }
            if(res.equalsIgnoreCase("rest")){
poke.setCurrentHP(poke.maxHP);
            }
            if (res.equalsIgnoreCase("Stats")) {
                System.out.println("-----------------------\n" +
                        "Here are " + poke.nickName + "'s stats \n");

                poke.getPokeStats();
            }
            if (res.equalsIgnoreCase("Shop")) {
                System.out.println("Gold: " + gold);
                System.out.println("""
                        -----------------------
                        What would you like to purchase
                        Rare Candy | Hyper Potion | Regular Potion |""");
                System.out.println("This shit dont work yet ");
                res = sc.nextLine();
            }

            if (res.equalsIgnoreCase(("battle"))) {
                /// determine luck
                /// will pick from array of pokemon depending on which travel area you are in
                //
                int lootGold = 10;
                int lootXP = 100;



//                int roll = rng.nextInt(100);
//                if (roll > 75){
//
//                } else if (roll < 75){
//
//
//                }


                Pokemon enemy = null;


                enemy = determineBattleOpponent("cave",gameDiffuclty);
                System.out.println("-----------------------\n" +
                        "You ran into a wild " + enemy.name + "\n Their stats are:");
                enemy.showEnemyStats();
//                enemy.getPokeStats();
                System.out.println("-----------------------\n");

//                poke.reportCurrentHP();
//                enemy.reportCurrentHP();

                System.out.println("Fight or Flee?");
                res = sc.nextLine();

                if (res.equalsIgnoreCase("Fight")) {
//                    System.out.println("Great Job you beat the enemy " + enemy.name);
//                    System.out.println("You have earned " + lootGold + " gold");
//                    System.out.println(poke.nickName + " has earned " + lootXP + " experience points");
//
//                    gold += lootGold;
//                    poke.increaseXP(lootXP);

                    Arena a = new Arena(poke,enemy);
                    System.out.println("Arena Close?");
                    gold += lootGold;
                    poke.increaseXP(lootXP);
                }

                if (res.equalsIgnoreCase("Flee")) {
                    gold -= lootGold;

                    int z = rng.nextInt(100);
                    System.out.println(z);

                    if (z < 60) {
                        System.out.println(poke.nickName + " took some damage while running away.");
                        poke.decreaseCurrentHP(20);
                        System.out.println();
                    }


                }


            }
            if (res.equalsIgnoreCase(("Help"))) {

                System.out.println("How to play?");
                System.out.println("Do battle with other random POkemon until yourr levels up.");
                System.out.println("Resting will fully heal your party");
                System.out.println("Click stats");
            }
            if (res.equalsIgnoreCase(("Difficulty"))) {

                System.out.println("Current Diffuculty is " + gameDiffuclty + "\nSelect New Difficulty" +
                        "\n0.Keep the Same | 1. Easy | 2. Medium | 3. Hard | 4. Very Hard | 5. Go back");

                int newDiffuculty = sc.nextInt();
                if (newDiffuculty >0 && newDiffuculty< 5){
                    gameDiffuclty = newDiffuculty;
                    System.out.println("Difficulty has beed updated to " + gameDiffuclty);
                }

            }
        } while (!res.equalsIgnoreCase("quit"));
    }
    public static void game2(){

        UserTrainer player = new UserTrainer();


        player.choseStarter();


        Scanner sc = new Scanner(System.in);
        String res;
        do {
            System.out.print("-----------------------\n"
                    + "What do you want to do?\n"
                    + "Battle | Gym | Pokemon | Items | Shop |\nRest | Travel | PokeDex | Help | Settings\n");
            res = sc.nextLine();


            if(res.equalsIgnoreCase("rest")){
                System.out.println("Welcome to the Pokemon Center........");
                player.myTeam.healAllPokemon();
            }  if(res.equalsIgnoreCase("travel")){
              player.travel();
            }


            if (res.equalsIgnoreCase("Shop")) {
                System.out.println("Gold: " + player.gold);
                System.out.println("""
                        -----------------------
                        What would you like to purchase
                        Rare Candy | Hyper Potion | Regular Potion |""");
                res = sc.nextLine();
                player.inventory.addPotion(1,player.inventory);
            }
            if (res.equalsIgnoreCase("items")) {
                System.out.println("Click on Number to Use.");
               String items = player.inventory.getItemsString();
                System.out.println(items);
            }
            if (res.equalsIgnoreCase("pokemon")) {

                System.out.println("1. Current Pokemon Stats\n2.Team Stats ");
                res = sc.nextLine();
                if (res.equalsIgnoreCase("1")) {
                    player.myTeam.showCurrentPokemonStats();
                } else if (res.equalsIgnoreCase("2")) {
                    player.myTeam.showAllPokemonStats();
                }
            }

            if (res.equalsIgnoreCase(("battle"))) {


            }
            if (res.equalsIgnoreCase(("Help"))) {

                System.out.println("How to play?");
                System.out.println("Do battle with other random POkemon until yourr levels up.");
                System.out.println("Resting will fully heal your party");
                System.out.println("Click stats");
            }

        } while (!res.equalsIgnoreCase("quit"));

    }

    public static void main(String[] args) {



game2();
    }
}
//// not sure if items should be a class with methods that i pass in poke object
//// or just methods on the pokemon object
//// or just the simple route and sort of code it into it
// should i make get enemy stats a static method that takes in a poke obj
/// or just a regular method that dosent