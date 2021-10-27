package com.company.Pokemon.Moves;

public class PokeAttacKMove {

    String name;
    double base_dmg;
    int energyCost;
    double accuracy;

    public PokeAttacKMove(String name,double base_dmg,int energyCost,double accuracy){
        this.name = name;
        this.base_dmg = base_dmg;
        this.energyCost = energyCost;
        this.accuracy =accuracy;
    }


}
