package com.company.Game;

import com.company.Pokemon.Moves.PokeAttacKMove;
import com.company.Pokemon.Pokemon;

import java.util.List;
import java.util.Scanner;

public class PokeBattle {

    boolean isFighting = true;
    boolean currentlyYourTurn;
    int turnCounter = 0;
    double userHP;
    double enemyHP;

    public PokeBattle(Pokemon p,Pokemon target) {

        System.out.println("----- Battle Start ---- Prepare for Combat with enemy " + target.name);

        p.showQuickStats();
        target.showQuickStats();
        userHP = p.currentHP;
        enemyHP = target.currentHP;
        Pokemon[] participants = {p,target};
        int moveIndex ;
        currentlyYourTurn = BattleCalculators.determineFirstTurn(p.speed, target.speed);

        Scanner sc = new Scanner(System.in);

        while (isFighting) {

            if (currentlyYourTurn) {
                System.out.println("1.Fight\t2.Items\t3.Pokemon\t4.Pass\t5.Flee");

                String action = sc.nextLine();


                if (action.equalsIgnoreCase("Fight")) {
                    PokeAttacKMove[] moves = new PokeAttacKMove[p.currentMoves.size()];
                    moves = p.currentMoves.toArray(moves);
                    String allNames = "";


                    for (int i=0;i <moves.length;i++){
                        allNames += i+1 +"." + moves[i].name + "\t";

                    }
                    System.out.println(allNames);
                    System.out.println("Enter Attack move #..");
                    moveIndex = sc.nextInt() - 1;


                    p.attack(target,moveIndex);

                }
                if (action.equalsIgnoreCase("pass") || action.isEmpty()) {
                    p.gainEnergy();
                } if (action.equalsIgnoreCase("pokemon") ){
                    System.out.println("SHow list of Current POkemon names");
                }
                if (action.equalsIgnoreCase("flee")) {

                    isFighting = false;

                }


            }

            if (!currentlyYourTurn) {
//                int pokeLogic = determinePokeFightLogic();
                target.attack(p,0);
            }

            handleUpdateTurn(participants);

        }
    }




    public void observePokeHP(Pokemon[] poke) {
        this.userHP = poke[0].getCurrentHP();
        this.enemyHP = poke[1].getCurrentHP();


        if (userHP == 0 || enemyHP == 0) {
            System.out.println("Battle over!");
            isFighting = false;

            if (userHP > 0){
                // user win
                System.out.println("You defeated " + poke[1].name );
            } else if (userHP <= 0){
                System.out.println("You lost to " + poke[1].name );
            }


        }


        if (userHP <= poke[0].getMaxHP() / 4){
            System.out.println("You are extremely low on hp.. Consider Running away");
        }


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