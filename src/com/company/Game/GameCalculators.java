package com.company.Game;

import com.company.Pokemon.Pokemon;

public class GameCalculators {


    public static boolean calculatePokemonCatch(double currentHP,double maxHP){
        double percentHP = currentHP / maxHP;

        if (percentHP < 0.4) return true;
        return false;

    }
}
