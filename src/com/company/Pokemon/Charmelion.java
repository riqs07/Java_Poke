package com.company.Pokemon;

import com.company.Pokemon.Pokemon;

public class Charmelion extends Pokemon implements Evolution {
    final double HEIGHT_MULTIPLIER = 1.3;


    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;


    // pass in object or copy
    public Charmelion(){
        name = "Charmelion";
        nickName = "Charmelion";
        pokedexID = 5;
        evolutionID = 6;
        evolution = "CHARIZARD";
        evo2 = PokeDex.CHARIZARD;
        currentLevel = 4;
        evolveLevel = 8;
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


    //Evolution Constructor
    public Charmelion(Pokemon poke){
        name = "Charmelion";
        nickName = poke.nickName;
        pokedexID = 5;
        evolutionID = 6;
        evolution = "Charmelion";
        evo2 = PokeDex.CHARIZARD;
        currentLevel = poke.currentLevel;
        evolveLevel = 8;
        energyGainRate = poke.energyGainRate;


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


    @Override
    public Pokemon evolve() {

        return new Charizard(this);
    }




// copy all poke stats
        //Vitals will not change that much

    }

