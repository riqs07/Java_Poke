package com.company.Pokemon;

public class Charizard extends Pokemon {


    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;



    public Charizard(){
        name = "Charizard";
        nickName = "Charizard";
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        evo2 = PokeDex.CHARIZARD;
        currentLevel = 8;
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
    }



    //Evolution Construcotr
    public Charizard(Pokemon poke) {
        name = "Charizard";
        nickName = poke.nickName;
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        evo2 = null;
        currentLevel = poke.currentLevel;
        evolveLevel = 8;
        energyGainRate = poke.energyGainRate;


        // STATS will change cuz of evolve need forumlas
        this.height = poke.height;
        this.weight = (int) (poke.weight * 2.5);
        this.bodyMassIndex = poke.bodyMassIndex;
        this.maxHP = poke.maxHP + 200;
        this.attack = poke.attack + 50;
        this.defense = poke.defense + 20;

        this.specialAttack = poke.specialAttack + 60;
        this.specialDefense = poke.specialDefense;

        currentHP = this.maxHP;
    }
}