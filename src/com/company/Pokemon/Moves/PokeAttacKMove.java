package com.company.Pokemon.Moves;

import com.company.Pokemon.Types.MoveTypes;
import com.company.Pokemon.Types.PokemonType;

public class PokeAttacKMove {

    public String name;
    public double base_dmg;
    public int energyCost;
    public double accuracy;
    public PokemonType type;
    public MoveTypes moveType;

    public PokeAttacKMove(String name,double base_dmg,int energyCost,double accuracy,PokemonType type,MoveTypes moveType){
        this.name = name;
        this.base_dmg = base_dmg;
        this.energyCost = energyCost;
        this.accuracy =accuracy;
        this.type =type;
        this.moveType = moveType;
    }


}
