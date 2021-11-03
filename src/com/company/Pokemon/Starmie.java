package com.company.Pokemon;

import com.company.Game.GameCalculators;
import com.company.Pokemon.Types.PokemonType;
import com.company.Pokemon.Types.WaterType;

public class Starmie extends Pokemon implements WaterType {
    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;

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
    //Default // Random

    public Starmie(){
        name = "Starmie";
        nickName = "Starmie";
        pokedexID = 5;
        evolution = PokeDex.STARMIE;
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        attributeType = PokemonType.WATER;

        this.height = GameCalculators.calculatePokeHeight(HEIGHT_MIN,HEIGHT_MAX,this.geneticLuck);
        this.weight = GameCalculators.calculatePokeWeight(WEIGHT_MIN,WEIGHT_MAX,this.geneticLuck);


        this.maxHP = GameCalculators.calculatePokeHP(HP_MIN,HP_MAX,WaterType.HPModifier,this.weight, this.geneticLuck);
        this.attack =GameCalculators.calculatePokeAtk(ATK_MIN,ATK_MAX,WaterType.ATKModifier,this.weight,this.geneticLuck);
        this.defense = GameCalculators.calculatePokeDEF(DEF_MIN,DEF_MAX,WaterType.DEFModifier,this.weight,this.geneticLuck);

        this.specialAttack= GameCalculators.calculatePokeSpAtk(SpATK_MIN,SpATK_MAX,WaterType.SpATKModifier,this.skillLuck);
        this.specialDefense = GameCalculators.calculatePokeSpDef(SpDEF_MIN,SpDEF_MAX,WaterType.SpDEFModifier,this.skillLuck);

        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);

        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);

        currentHP = this.maxHP;
    }


    // Luck Based

    public Starmie(int geneticLuck, int skillLuck)  {
        super(geneticLuck,skillLuck);

        name = "Starmie";
        nickName = "Starmie";
        pokedexID = 5;
        evolution = null;
        prevEvolution = PokeDex.STARMIE;
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        attributeType = PokemonType.WATER;
        this.height = GameCalculators.calculatePokeHeight(HEIGHT_MIN,HEIGHT_MAX,this.geneticLuck);
        this.weight = GameCalculators.calculatePokeWeight(WEIGHT_MIN,WEIGHT_MAX,this.geneticLuck);


        this.maxHP = GameCalculators.calculatePokeHP(HP_MIN,HP_MAX,WaterType.HPModifier,this.weight, this.geneticLuck);
        this.attack =GameCalculators.calculatePokeAtk(ATK_MIN,ATK_MAX,WaterType.ATKModifier,this.weight,this.geneticLuck);
        this.defense = GameCalculators.calculatePokeDEF(DEF_MIN,DEF_MAX,WaterType.DEFModifier,this.weight,this.geneticLuck);

        this.specialAttack= GameCalculators.calculatePokeSpAtk(SpATK_MIN,SpATK_MAX,WaterType.SpATKModifier,this.skillLuck);
        this.specialDefense = GameCalculators.calculatePokeSpDef(SpDEF_MIN,SpDEF_MAX,WaterType.SpDEFModifier,this.skillLuck);

        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);
        currentHP = this.maxHP;

    }


    //Evolution Constructor
    public Starmie(Pokemon poke){
        name = "Starmie";
        nickName = poke.nickName;
        pokedexID = 5;
        evolution = null;
        currentLevel = poke.currentLevel;
        evolveLevel = 8;
        energyGainRate = poke.energyGainRate;

        attributeType = PokemonType.WATER;

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
