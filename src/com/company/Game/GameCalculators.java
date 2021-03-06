package com.company.Game;

import com.company.Pokemon.Charmander;
import com.company.Pokemon.Pokemon;

import java.util.Random;
import java.util.stream.IntStream;

public class GameCalculators {

// one time questions
    // one time creations
    public static boolean calculatePokemonCatch(double currentHP, double maxHP) {
        double percentHP = currentHP / maxHP;

        return percentHP < 0.4;

    }


    public static int getNumBetweenRange(int min, int max) {
        Random rng = new Random();


        return rng.nextInt(max - min + 1) + min;
    }

    public static double getHeightLuckFactor(int luck) {

        double factor = 0;
        if (luck <= 35) {
            factor = 1.0;
        } else if (luck < 65) {
            factor = 1.20;

        } else if (luck >= 65 && luck < 85) {
            factor = 1.35;
        } else if (luck >= 85 && luck < 95) {
            factor = 1.5;

        } else if (luck >= 95) {
            factor = 1.7;
        }
        return factor;
    }

    public static double getWeightLuckFactor(int luck) {

        double factor = 0;
        if (luck <= 35) {
            factor = 1.0;
        } else if (luck > 35 && luck < 65) {
            factor = 1.20;

        } else if (luck >= 65 && luck < 85) {
            factor = 1.35;
        } else if (luck >= 85 && luck < 95) {
            factor = 1.5;

        } else if (luck >= 95) {
            factor = 1.7;
        }
        return factor;
    }



    public static int calculatePokeHeight(int min,int max,int luck){
        double height = GameCalculators.getNumBetweenRange(min,max);
        height = height * GameCalculators.getHeightLuckFactor(luck);

        return (int) height;
    }

    public static int calculatePokeWeight(int min, int max,int luck){

        double weight = GameCalculators.getNumBetweenRange(min,max);
        weight = weight * GameCalculators.getWeightLuckFactor(luck);

        return (int) weight;

    }

    public static int calculatePokeHP(int min, int max, double mod, int weight,int luck){
        double hp = GameCalculators.getNumBetweenRange(min,max);
        hp = hp * GameCalculators.getWeightLuckFactor(weight);

        return (int) hp;
    }
    public static int calculatePokeAtk(int min, int max, double mod, int weight,int luck){
        double atk = GameCalculators.getNumBetweenRange(min,max);
        atk = atk * GameCalculators.getWeightLuckFactor(weight);

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

        atk = (atk * factor) * mod;
        return (int) atk;

    }

    public static double calculatePokeDEF(int min,int max, double mod,int weight, int luck) {
        double def = GameCalculators.getNumBetweenRange(min,max);
        def = def * GameCalculators.getWeightLuckFactor(weight);

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

        def =(def * factor) * mod;
        return (int) def;

    }

    public static double calculatePokeSpAtk(int min,int max, double mod,int luck) {
        double atk = GameCalculators.getNumBetweenRange(min,max);

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

        atk = (atk * factor) * mod;
        return (int) atk;
    }

    public static double calculatePokeSpDef(int min,int max, double mod,int luck) {
        double def = GameCalculators.getNumBetweenRange(min,max);

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

        def = (def * factor) * mod;
        return (int) def;
    }

    public static int calculatePokeSpeed(int min,int max,int luck){
        double speed = GameCalculators.getNumBetweenRange(min,max);

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

        speed = speed * factor;
        return (int) speed;
    }
    public static void rollPokemon(int size){
        Charmander[] pokemon = new Charmander[size];


        int legendCount= 0;
        int epicCount= 0;
        int rareCount= 0;
        int uncommonCount= 0;
        int commonCount= 0;

        for (int i = 0;i < pokemon.length; i++){
            pokemon[i] = new Charmander(100,100);
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



    public static void main(String[] args) {
        GameCalculators.rollPokemon(2);
    }
}
