package com.company.Pokemon;

import com.company.Game.GameCalculators;
import com.company.Pokemon.Types.WaterType;
import com.company.Pokemon.Types.PokemonType;

public class Staryu extends Pokemon implements Evolution, WaterType {

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
    public Staryu(){
        name = "Staryu";
        nickName = "Staryu";
        pokedexID = 5;
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

    public Staryu(int geneticLuck, int skillLuck)  {
        super(geneticLuck,skillLuck);

        name = "Staryu";
        nickName = "Staryu";
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

        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);

        currentHP = this.maxHP;

    }



    public Pokemon evolve() {

        return new Starmie(this);
    }
}
