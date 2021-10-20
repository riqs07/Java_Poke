package com.company.Pokemon;

public class Starmie extends Pokemon {
    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;

    //Default // Random
    public Starmie(){
        name = "Starmie";
        nickName = "Starmie";
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

    public Starmie(int geneticLuck, int skillLuck)  {
        super(geneticLuck,skillLuck);

        name = "Starmie";
        nickName = "Starmie";
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        prevEvolution = null;
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




    //Evolution Constructor
    public Starmie(Pokemon poke){
        name = "Starmie";
        nickName = poke.nickName;
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        evo2 =null;
        currentLevel = poke.currentLevel;
        evolveLevel = 8;
        energyGainRate = poke.energyGainRate;

        type = PokemonType.WATER;

        // STATS will change cuz of evolve need forumlas
        this.height = poke.height;
        this.weight = (int) (poke.weight * 1.6);
        this.bodyMassIndex = poke.bodyMassIndex;
        this.maxHP = poke.maxHP +100;
        this.attack =poke.attack + 10;
        this.defense = poke.defense + 20;

        this.specialAttack= poke.specialAttack;
        this.specialDefense = poke.specialDefense;

        currentHP = this.maxHP;
    }
}
