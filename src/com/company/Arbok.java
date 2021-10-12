package com.company;

public class Arbok extends Pokemon {
    final int HEIGHT_MIN = 120;
    final int HEIGHT_AVG = 138;
    final int HEIGHT_MAX = 150;


    final int WEIGHT_MIN = 135;
    final int WEIGHT_AVG = 143;
    final int WEIGHT_MAX = 160;


    public Arbok() {

        name = "Arbok";
        nickName = "Arbok";
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        prevEvolution = "Ekans";
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
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

    public Arbok(int geneticLuck, int skillLuck) {
    super(geneticLuck,skillLuck);

        name = "Arbok";
        nickName = "Arbok";
        pokedexID = 5;
        evolutionID = 6;
        evolution = null;
        prevEvolution = "Ekans";
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;

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



        public void useSpecialAtack(Pokemon target){
        System.out.println(target.specialDefense);
        if (currentEnergy < 2){
            System.out.println("Not enough Energy. Basic Atk instead");
        }
        if (currentEnergy >= 2 && currentEnergy < 4){
            System.out.println("Specual attack 1");
        }

        if (currentEnergy > 4){
            System.out.println("mega special atk");
        }




    }
}
