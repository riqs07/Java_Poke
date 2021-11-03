package com.company.Pokemon;

import com.company.Game.GameCalculators;
import com.company.Pokemon.Types.FireType;
import com.company.Pokemon.Types.PokemonType;

public class Charmander extends Pokemon implements FireType, Evolution {

    final private int HEIGHT_MIN = 18;
    final private int HEIGHT_AVG = 24;
    final private int HEIGHT_MAX = 28;


    final private int WEIGHT_MIN = 14;
    final private int WEIGHT_AVG = 19;
    final private int WEIGHT_MAX = 28;

    final private int ATK_MIN = 11;
    final private int ATK_MAX = 19;

    final private int SpATK_MIN = 11;
    final private int SpATK_MAX = 16;




    final private int SpDEF_MIN = 6;
    final private int SpDEF_MAX = 10;




    final private int HP_MIN= 19;
    final private int HP_MAX= 30;


    final private int DEF_MIN = 9;
    final private int DEF_MAX = 14;


    final private int SPEED_MIN= 10;
    final private int SPEED_MAX= 16;



    public Charmander(){
        name = "Charmander";
        nickName = "Charmander";
        pokedexID = 5;
        evolution = PokeDex.CHARMELION;
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        maxEnergy = 3;
        attributeType = PokemonType.FIRE;
        this.height = GameCalculators.calculatePokeHeight(HEIGHT_MIN,HEIGHT_MAX,this.geneticLuck);
        this.weight = GameCalculators.calculatePokeWeight(WEIGHT_MIN,WEIGHT_MAX,this.geneticLuck);


        this.maxHP = GameCalculators.calculatePokeHP(HP_MIN,HP_MAX,FireType.HPModifier,this.weight, this.geneticLuck);
        this.attack =GameCalculators.calculatePokeAtk(ATK_MIN,ATK_MAX,FireType.ATKModifier,this.weight,this.geneticLuck);
        this.defense = GameCalculators.calculatePokeDEF(DEF_MIN,DEF_MAX,FireType.DEFModifier,this.weight,this.geneticLuck);

        this.specialAttack= GameCalculators.calculatePokeSpAtk(SpATK_MIN,SpATK_MAX,FireType.SpATKModifier,this.skillLuck);
        this.specialDefense = GameCalculators.calculatePokeSpDef(SpDEF_MIN,SpDEF_MAX,FireType.SpDEFModifier,this.skillLuck);

        this.speed = GameCalculators.calculatePokeSpeed(SPEED_MIN,SPEED_MAX,this.geneticLuck);

        currentHP = this.maxHP;




    }

    public Charmander(int geneticLuck, int skillLuck)  {
        super(geneticLuck,skillLuck);

        name = "Charmander";
        nickName = "Charmander";
        pokedexID = 5;
        evolution = PokeDex.CHARMELION;
        currentLevel = 1;
        evolveLevel = 4;
        energyGainRate = 1.25;
        maxEnergy = 3;
        attributeType = PokemonType.FIRE;
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
        currentMoves.add(FireType.ember(specialAttack));


    }




    @Override
    public Pokemon evolve() {

        return new Charmelion(this);
    }




}
