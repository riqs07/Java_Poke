package com.company.Game;

import com.company.Pokemon.PokeTeam;
import com.company.Pokemon.Pokemon;
import com.company.RNG;

import java.util.Scanner;

public class Arena {
    private double userHP;
    private double enemyHP;

    RNG rng = new RNG();


    private int turnCounter;
    boolean currentlyYourTurn = true;

    boolean isFighting = true;
    Scanner sc = new Scanner(System.in);

    public Arena(Pokemon user, Pokemon enemy) {


        final Pokemon[] pokemon = {user, enemy};
        System.out.println("----- Battle Start ---- Prepare for Combat with " + enemy.name);

        while (isFighting) {

        if (currentlyYourTurn){
            System.out.println("ATK Basic Attack | SATK Special Attack | Pass |  Flee \nCurrent HP: " + (int) user.currentHP + " | Energy: " +  user.currentEnergy +"\nEnemy HP: " + (int) enemy.currentHP + " | Energy: " + enemy.currentEnergy);

            String move = sc.nextLine();

            if (move.equalsIgnoreCase("atk")){
                user.executeBasicAtk(enemy);
            }
            if (move.equalsIgnoreCase("pass") || move.isEmpty()){
                user.gainEnergy();
            }
            if (move.equalsIgnoreCase("flee")){

                continue;

            }
//            if (move == 2){
//                user.specialAttack(enemy);
//            }


        }

        if (!currentlyYourTurn){
            enemy.executeBasicAtk(user);
        }



            // determine attack based on move set & energy
            handleUpdateTurn(pokemon);

        }


    }

    public Arena(Pokemon user, PokeTeam enemies) {

        Pokemon currentEnemy;

            for (int i = 0; i < enemies.size(); i++) {
                currentEnemy = enemies.get(i);

                if (currentlyYourTurn) {
                    System.out.println("ATK Basic Attack | SATK Special Attack | Pass |  Flee \nCurrent HP: " + (int) user.currentHP + " | Energy: " + user.currentEnergy + "\nEnemy HP: " + (int) currentEnemy.currentHP + " | Energy: " + currentEnemy.currentEnergy);

                    String move = sc.nextLine();

                    if (move.equalsIgnoreCase("atk")) {
                        user.executeBasicAtk(currentEnemy);
                    }
                    if (move.equalsIgnoreCase("pass") || move.isEmpty()) {
                        user.gainEnergy();
                    }
                    if (move.equalsIgnoreCase("flee")) {
//                        if (!canFlee){
//                            System.out.println("You cannot flee this battle!");
//                            continue;
//                        }
                        isFighting = false;

                    }
//            if (move == 2){
//                user.specialAttack(enemy);
//            }


                }

                if (!currentlyYourTurn) {
                    currentEnemy.executeBasicAtk(user);
                }


                // determine attack based on move set & energy
//                handleUpdateTurn(pokemon);
            }


    }
    public void observePokeHP(Pokemon[] poke) {
        this.userHP = poke[0].getCurrentHP();
        this.enemyHP = poke[1].getCurrentHP();


        if (userHP == 0 || enemyHP == 0) {
            System.out.println("battle over");
            isFighting = false;

            if (userHP > 0){
                // user win

            }

        }

        if (userHP <= poke[0].getMaxHP() / 2){
            System.out.println("You are low on hp.. Consider Running away");
        }

        if (userHP <= poke[0].getMaxHP() / 4){
            System.out.println("You are extremely low on hp.. Consider Running away");
        }

//        if (enemyHP <= poke[1].getMaxHP() / 2){
//            System.out.println("You are low on hp.. Consider Running away");
//        }
//
//        if (enemyHP <= poke[1].getMaxHP() / 4){
//            System.out.println("They are extremely low on hp.. Consider Capturing");
//        }



    }

    public void handleUpdateTurn(Pokemon[] poke) {
        System.out.println("-------------- Round " + turnCounter + "--------------");

        currentlyYourTurn = !currentlyYourTurn;
        if (currentlyYourTurn){
            System.out.println("--Your Move--");
            poke[0].gainEnergy();
        }

        if (!currentlyYourTurn){
            System.out.println("--CPU Move--");
            poke[1].gainEnergy();

        }

    turnCounter++;
    observePokeHP(poke);



    }



}
