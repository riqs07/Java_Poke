package com.company.Pokemon;

import com.company.PokemonType;

public class Staryu extends Pokemon implements Evolution{

    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;


    //Default // Random
    public Staryu(){
        name = "Staryu";
        nickName = "Staryu";
        pokedexID = 5;
        evolutionID = 6;
        evolution = "Starmie";
        evo2 = PokeDex.STARMIE;
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        type = PokemonType.WATER;

        this.height = Pokemon.calculatePokeHeight(HEIGHT_MIN,HEIGHT_MAX,this.geneticLuck);
        this.weight = Pokemon.calculatePokeWeight(WEIGHT_MIN,WEIGHT_MAX,this.geneticLuck);
        this.bodyMassIndex = Pokemon.calculatePokeBMI(this.weight,this.height);
        this.maxHP = Pokemon.calculatePokeHP(this.bodyMassIndex, this.weight, this.geneticLuck);
        this.attack =Pokemon.calculatePokeAtk(this.bodyMassIndex,this.geneticLuck);
        this.defense = Pokemon.calculatePokeDEF(this.bodyMassIndex,this.geneticLuck);

        this.specialAttack= Pokemon.calculatePokeSpAtk(this.skillLuck);
        this.specialDefense = Pokemon.calculatePokeSpDef(this.skillLuck);

        currentHP = this.maxHP;
    }


    // Luck Based

    public Staryu(int geneticLuck, int skillLuck)  {
        super(geneticLuck,skillLuck);

        name = "Staryu";
        nickName = "Staryu";
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        prevEvolution = "Ekans";
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        type = PokemonType.WATER;
        this.height = Pokemon.calculatePokeHeight(HEIGHT_MIN, HEIGHT_MAX, this.geneticLuck);
        this.weight = Pokemon.calculatePokeWeight(WEIGHT_MIN, WEIGHT_MAX, this.geneticLuck);
        this.bodyMassIndex = Pokemon.calculatePokeBMI(this.weight, this.height);
        this.maxHP = Pokemon.calculatePokeHP(this.bodyMassIndex, this.weight, this.geneticLuck);
        this.attack = Pokemon.calculatePokeAtk(this.bodyMassIndex, this.geneticLuck);
        this.defense = Pokemon.calculatePokeDEF(this.bodyMassIndex, this.geneticLuck);

        this.specialAttack = Pokemon.calculatePokeSpAtk(this.skillLuck);
        this.specialDefense = Pokemon.calculatePokeSpDef(this.skillLuck);

        currentHP = this.maxHP;

    }



    public Pokemon evolve() {

        return new Starmie(this);
    }
}
