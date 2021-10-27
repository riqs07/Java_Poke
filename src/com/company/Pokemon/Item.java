package com.company.Pokemon;


import com.company.PokemonTrainers.PokeTrainer;

public class Item {

    public final Items name;
    public final String type;
    public final String description;
    public final int cost;

    public Item(Items name, String sName, String effect, String description,int cost) {
        this.name = name;
        this.type = effect;
        this.description = description;
        this.cost = cost;

    }

    public void use(Pokemon p, Item item) {
//        if (item.type.equals("Potion")) {
//            p.increaseCurrentHP(item);
//        }
    }



}