package com.company.PokemonTrainers;

import com.company.Game.GameCalculators;
import com.company.Game.TravelLocation;
import com.company.Pokemon.*;

import java.security.PublicKey;
import java.util.Scanner;

public class UserTrainer extends PokeTrainer {
    int score;
    public int gold = 100;
    Badge[] badges;

    public void setLocation(TravelLocation location) {
        this.location = location;
    }

    public TravelLocation location = TravelLocation.GRASSLANDS;


    public void travel(){
        System.out.println("Where would you like to travel too?");
        System.out.println("Current Location:" + this.location);
        System.out.println("1.GRASSLANDS,2.CERULEAN_CITY,3.HIGHWAY,4.CINNABAR_VOLCANO,5.BEACH\n");
        Scanner s = new Scanner(System.in);

        int select = s.nextInt();

        switch (select) {
            case 1 -> this.setLocation(TravelLocation.GRASSLANDS);
            case 2 -> this.setLocation(TravelLocation.CERULEAN_CITY);
            case 3 -> this.setLocation(TravelLocation.CINNABAR_VOLCANO);
            case 4 -> this.setLocation(TravelLocation.BEACH);

        }
        System.out.println("Success! You have arrived at " + this.location);    }


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
