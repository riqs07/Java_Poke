package com.company.Pokemon;

import com.company.Game.GameCalculators;
import com.company.Pokemon.Types.FireType;
import com.company.Pokemon.Types.PokemonType;

public class Arbok extends Pokemon implements FireType {
    final int HEIGHT_MIN = 120;
    final int HEIGHT_AVG = 138;
    final int HEIGHT_MAX = 150;


    final int WEIGHT_MIN = 135;
    final int WEIGHT_AVG = 143;
    final int WEIGHT_MAX = 160;
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



    public Arbok() {

        name = "Arbok";
        nickName = "Arbok";
        pokedexID = 5;
        evolution = null;
        prevEvolution = PokeDex.EKANS;
        currentLevel = 1;
        energyGainRate = 1.25;
        attributeType = PokemonType.POISON;
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

    public Arbok(int geneticLuck, int skillLuck)  {
    super(geneticLuck,skillLuck);

        name = "Arbok";
        nickName = "Arbok";
        pokedexID = 5;
        evolution = null;
        prevEvolution = PokeDex.EKANS;
        currentLevel = 1;
        energyGainRate = 1.25;
        attributeType = PokemonType.POISON;
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
