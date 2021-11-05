package com.company.Game;

import com.company.Pokemon.Moves.PokeAttacKMove;
import com.company.Pokemon.Pokemon;
import com.company.Pokemon.Types.MoveTypes;
import com.company.Pokemon.Types.PokemonType;

import java.util.Random;

public class BattleCalculators {


    public static double calculateAttackDamage(Pokemon target, PokeAttacKMove selectedMove){

        double base_dmg = selectedMove.base_dmg;
        double dmg = 0;


            if (selectedMove.moveType == MoveTypes.PHYSICAL){
                double dmgMod = (100/ (100 + target.defense));
                return (dmgMod * base_dmg);

            }
            if (selectedMove.moveType == MoveTypes.SPECIAL){
                double dmgMod = (100/ (100 + target.specialDefense));
                double typeDMGMOD = determineTypeDMGMod(selectedMove.type,target.attributeType);
                return (dmgMod * base_dmg) * typeDMGMOD;
            }
        
            return dmg;
    }
    
    


    public static double determineTypeDMGMod(PokemonType orgin, PokemonType target){

        double mod = 1.0;


        if (target == PokemonType.FIRE){
            if (orgin == PokemonType.WATER) mod = 2.0;
            if (orgin == PokemonType.GROUND) mod = 2.0;
            if (orgin == PokemonType.BUG) mod = 0.5;
            if (orgin == PokemonType.GRASS) mod = 0.5;
        }



        return mod;
    }


    public static boolean determineFirstTurn(double playerSpeed,double enemySpeed){

        return playerSpeed > enemySpeed;

    }



    public static double calculateBasicAtkDamage(Pokemon target,double base_dmg) {
        double dmgMod = (100/ (100 + target.specialDefense));
        // need router func to figure out resist
        // determine type dmg mod

        double typeDMGMOD = 1.0;
        return  (dmgMod * base_dmg) * typeDMGMOD;
    }
    public static double calculateSpAtkDmg(Pokemon target, double base_dmg, PokemonType type){

        double dmgMod = (100/ (100 + target.specialDefense));
        // need router func to figure out resist
        // determine type dmg mod

        double typeDMGMOD = 1.0;
        return  (dmgMod * base_dmg) * typeDMGMOD;

    }
    public static boolean determineMiss(double accuracy){

        int chance = (int) accuracy * 100;

        Random rng = new Random();
        int roll = rng.nextInt(100);

        return roll <= chance;
    }
    public static boolean canFlee(int luck){

        return luck >= 500;
    }

}
