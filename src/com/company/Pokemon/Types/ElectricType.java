package com.company.Pokemon.Types;

import com.company.Pokemon.Moves.PokeAttacKMove;

public interface ElectricType   {
    double SpATKModifier = 1.4;
    double HPModifier = 1.2;
    double ATKModifier = 1.0;
    double DEFModifier = 0.9;
    double SpDEFModifier = 0.8;


    PokemonType[] weakAgainst = {PokemonType.GRASS,PokemonType.GROUND};
    PokemonType[] strongAgainst = {PokemonType.WATER,PokemonType.FLYING};



}
