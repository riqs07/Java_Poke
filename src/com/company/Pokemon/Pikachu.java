package com.company.Pokemon;

import com.company.Pokemon.Pokemon;

public class Pikachu extends Pokemon {
    final int HEIGHT_MIN = 10;
    final int HEIGHT_AVG = 14;
    final int HEIGHT_MAX = 19;


    final int WEIGHT_MIN = 10;
    final int WEIGHT_AVG = 13;
    final int WEIGHT_MAX = 19;


    public Pikachu(){
        name = "Pikachu";
        nickName = "Pikachu";
        pokedexID = 5;
        evolutionID = 6;
        evolution = "Raichu";
        prevEvolution = "Pichu";
        currentLevel = 1;
        evolveLevel = 4;

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

}
