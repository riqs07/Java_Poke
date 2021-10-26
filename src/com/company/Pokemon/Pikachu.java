package com.company.Pokemon;

import com.company.Game.GameCalculators;
import com.company.Pokemon.Pokemon;

public class Pikachu extends Pokemon implements FireType {
    final int HEIGHT_MIN = 10;
    final int HEIGHT_AVG = 14;
    final int HEIGHT_MAX = 19;


    final int WEIGHT_MIN = 10;
    final int WEIGHT_AVG = 13;
    final int WEIGHT_MAX = 19;

    final private int ATK_MIN = 19;
    final private int ATK_MAX = 19;

    final private int SpATK_MIN = 19;
    final private int SpATK_MAX = 19;

    final private int SpDEF_MIN = 19;
    final private int SpDEF_MAX = 19;

    final private int HP_MIN= 19;
    final private int HP_MAX= 19;


    final private int DEF_MIN = 19;
    final private int DEF_MAX = 19;

    final private int SPEED_MIN= 19;
    final private int SPEED_MAX= 19;




    public Pikachu(){
        name = "Pikachu";
        nickName = "Pikachu";
        pokedexID = 5;

        evolution = PokeDex.RAICHU;
        prevEvolution = PokeDex.PICHU;
        currentLevel = 1;
        evolveLevel = 4;

        this.height = GameCalculators.calculatePokeHeight(HEIGHT_MIN,HEIGHT_MAX,this.geneticLuck);
        this.weight = GameCalculators.calculatePokeWeight(WEIGHT_MIN,WEIGHT_MAX,this.geneticLuck);


        this.maxHP = GameCalculators.calculatePokeHP(HP_MIN,HP_MAX,FireType.HPModifier,this.weight, this.geneticLuck);
        this.attack =GameCalculators.calculatePokeAtk(ATK_MIN,ATK_MAX,FireType.ATKModifier,this.weight,this.geneticLuck);
        this.defense = GameCalculators.calculatePokeDEF(DEF_MIN,DEF_MAX,FireType.DEFModifier,this.weight,this.geneticLuck);

        this.specialAttack= GameCalculators.calculatePokeSpAtk(SpATK_MIN,SpATK_MAX,FireType.SpATKModifier,this.skillLuck);
        this.specialDefense = GameCalculators.calculatePokeSpDef(SpDEF_MIN,SpDEF_MAX,FireType.SpDEFModifier,this.skillLuck);

        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);
        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);

        currentHP = this.maxHP;
//        System.out.println("Genes: " + this.geneticLuck +"\n Skills:" + this.skillLuck + "\n Luck Factor:" + this.luck);
//        System.out.println("Height: " + this.height+ "\n Weight: " + this.weight);




    }

}
