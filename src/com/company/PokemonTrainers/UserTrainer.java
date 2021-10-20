package com.company.PokemonTrainers;

import com.company.Game.GameCalculators;
import com.company.Pokemon.*;

import java.security.PublicKey;
import java.util.Scanner;

public class UserTrainer extends PokeTrainer {
    int score;
    public int gold = 0;
    Badge[] badges;





    public void choseStarter(){
        /// SELECT STARTER
        /// CREATE APPROPRIATE POKEMON
        /// CREATE AND ADD AS 1ST POKEMON IN TEAM LIST

        System.out.println("Please Select your starter. \n 1.Charmander 2.Starmie 3.Pikachu \n");
        Scanner s = new Scanner(System.in);

        int select = s.nextInt();

        switch (select) {
            case 1 -> myTeam.addPokemon(new Charmander());
            case 2 -> myTeam.addPokemon(new Starmie());
            case 3 -> myTeam.addPokemon(new Pikachu());
        }


        System.out.println("Congrats on your new " + myTeam.getCurrentPoke().name + "\n Would you like to give them a name? \n Type their name or type no.");
        String res = s.nextLine();

        if (!res.equalsIgnoreCase("no") || !res.equals("")) {
            myTeam.getCurrentPoke().nickName = res;
        }
//        s.close();

    }


    public void fleeEncounter(){

    }


    public void catchPokemon(Pokemon p){
        // Do calc to see if catch suceeful

        boolean isCaught = GameCalculators.calculatePokemonCatch(p.currentHP,p.maxHP);
        if (isCaught){
            myTeam.addPokemon(p);
            System.out.println("Good Job. Pokemon was caught");
        } else {

        System.out.println("Attempt unsuccess");
        }
    }

    public static void main(String[] args) {
        UserTrainer player = new UserTrainer();
        Charmander c = new Charmander();
        Charmander d = new Charmander();
        Arbok e = new Arbok();

        player.catchPokemon(c);

        c.currentHP = 1;
        player.catchPokemon(c);
        player.myTeam.getCurrentPoke().getPokeStats();

        player.myTeam.addPokemon(d);
        player.myTeam.addPokemon(e);

        player.swapPokemon(2);

        player.myTeam.getMyTeam();
        player.myTeam.getCurrentPoke().getPokeStats();
    }
}
