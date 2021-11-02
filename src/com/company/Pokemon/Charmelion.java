package com.company.Pokemon;

import com.company.Game.GameCalculators;
import com.company.Pokemon.Moves.PokeAttacKMove;
import com.company.Pokemon.Types.FireType;

public class Charmelion extends Pokemon implements Evolution, FireType {
    final double HEIGHT_MULTIPLIER = 1.3;


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


    // pass in object or copy
    public Charmelion(){
        name = "Charmelion";
        nickName = "Charmelion";
        pokedexID = 5;
        evolution = PokeDex.CHARIZARD;
        prevEvolution = PokeDex.CHARMELION;
        currentLevel = 4;
        evolveLevel = 8;
        energyGainRate = 1.25;
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
    }


    //Evolution Constructor
    public Charmelion(Pokemon poke){
        name = "Charmelion";
        nickName = poke.nickName;
        pokedexID = 5;
        evolution = PokeDex.CHARIZARD;
        prevEvolution = PokeDex.CHARMELION;
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

    @Override
    public void basicAtk1(Pokemon target) {

    }

    @Override
    public void spAtk1(Pokemon target) {
        PokeAttacKMove spAtkMove = FireType.firePunch(specialAttack);

        double dmg = spAtkMove.base_dmg;
        double typeDMGMOD;

        double dmgMod = (100/ (100 + target.specialDefense));

        dmg = dmgMod * dmg;
        target.decreaseCurrentHP(dmg);
        target.observeHP();
    }

    @Override
    public void spAtk2(Pokemon target) {
        PokeAttacKMove spAtkMove = FireType.flamethrower(specialAttack);

        double dmg = spAtkMove.base_dmg;
        double typeDMGMOD;

        double dmgMod = (100/ (100 + target.specialDefense));

        dmg = dmgMod * dmg;
        target.decreaseCurrentHP(dmg);
        target.observeHP();
    }


// copy all poke stats
        //Vitals will not change that much

    }

