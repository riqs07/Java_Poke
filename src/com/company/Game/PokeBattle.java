package com.company.Game;

import com.company.Pokemon.Pokemon;

import java.util.Scanner;

public class PokeBattle {

    boolean isFighting = true;
    boolean currentlyYourTurn;
    int turnCounter = 0;
    double userHP;
    double enemyHP;

    public PokeBattle(Pokemon p,Pokemon target) {


        p.showQuickStats();
        target.showQuickStats();
        userHP = p.currentHP;
        enemyHP = target.currentHP;
        Pokemon[] poke = {p,target};

        currentlyYourTurn = determineFirstTurn(p.speed, target.speed);

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Battle Start ---- Prepare for Combat with " + target.name);

        while (isFighting) {

            if (currentlyYourTurn) {
                System.out.println("1.Fight\t2.Items\t3.Pokemon\t4.Pass\t5.Flee");

                String move = sc.nextLine();

                if (move.equalsIgnoreCase("Fight")) {
//                    String s="";
//
//                    for (int i = 0;i <p.currentMoves.length;i++){
//                        s += i+2 + "." + p.currentMoves[i].name;
//                    }
//                    System.out.println("1.Physical Attack\t" + s);
                    System.out.println("1.Basic Atk\t2.SpAtk1\\t3.SpAtk2");
                    p.basicAtk1(target);
                }
                if (move.equalsIgnoreCase("pass") || move.isEmpty()) {
                    p.gainEnergy();
                } if (move.equalsIgnoreCase("pokemon") ){
                    p.spAtk1(target);
                }
                if (move.equalsIgnoreCase("flee")) {

                    isFighting = false;

                }


            }

            if (!currentlyYourTurn) {
                target.basicAtk1(p);
            }

            handleUpdateTurn(poke);

        }
    }
    private boolean determineFirstTurn(double playerSpeed,double enemySpeed){

        return playerSpeed > enemySpeed;

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