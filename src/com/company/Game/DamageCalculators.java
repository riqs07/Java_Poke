package com.company.Game;

import com.company.Pokemon.Types.PokemonType;

public class DamageCalculators {


    public static double calculateBasicAtkDamage(double attack, int weight) {
        return 2;
    }

    public double determineTypeDMGMod(PokemonType orgin, PokemonType target){

        double mod = 1.0;


        if (target == PokemonType.FIRE){
            if (orgin == PokemonType.WATER) mod = 2.0;
            if (orgin == PokemonType.GROUND) mod = 2.0;
            if (orgin == PokemonType.BUG) mod = 0.5;
            if (orgin == PokemonType.GRASS) mod = 0.5;
        }



        return mod;
    }
}
