package com.company;

public class Charmander extends Pokemon implements FireType{

    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;


    public Charmander(){
        name = "Charmander";
        nickName = "Charmander";
        pokedexID = 5;
        evolutionID = 6;
        evolution = "Charmelion";
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        this.height = Pokemon.calculatePokeHeight(HEIGHT_MIN,HEIGHT_MAX,this.geneticLuck);
        this.weight = Pokemon.calculatePokeWeight(WEIGHT_MIN,WEIGHT_MAX,this.geneticLuck);
        this.bodyMassIndex = Pokemon.calculatePokeBMI(this.weight,this.height);
        this.maxHP = Pokemon.calculatePokeHP(this.bodyMassIndex, this.weight, this.geneticLuck);
        this.attack =Pokemon.calculatePokeAtk(this.bodyMassIndex,this.geneticLuck);
        this.defense = Pokemon.calculatePokeDEF(this.bodyMassIndex,this.geneticLuck);

        this.specialAttack= Pokemon.calculatePokeSpAtk(this.skillLuck);
        this.specialDefense = Pokemon.calculatePokeSpDef(this.skillLuck);

        currentHP = this.maxHP;
//        System.out.println("Genes: " + this.geneticLuck +"\n Skills:" + this.skillLuck + "\n Luck Factor:" + this.luck);
//        System.out.println("Height: " + this.height+ "\n Weight: " + this.weight);




    }





    public static void main(String[] args) {


    }
}
