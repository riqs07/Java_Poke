package com.company.Pokemon.Types;

import com.company.Pokemon.Moves.PokeAttacKMove;

public interface FireType {

    double SpATKModifier = 1.4;
    double HPModifier = 1.2;
    double ATKModifier = 1.0;
    double DEFModifier = 0.9;
    double SpDEFModifier = 0.8;

    PokemonType[] weakAgainst = {PokemonType.WATER,PokemonType.GROUND};
    PokemonType[] strongAgainst = {PokemonType.ICE,PokemonType.GRASS};



     static PokeAttacKMove flamethrower(double spAtk) {
        double dmg = 150 + (.8 * spAtk);
        return new PokeAttacKMove("Flamethrower",dmg,4,.80);

    }

     static PokeAttacKMove pound(double ATK) {
        double dmg = 50 * (.4 * ATK);
        return new PokeAttacKMove("Pound",dmg,1,.80);
    }

}
