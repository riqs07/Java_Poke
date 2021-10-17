package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.PokemonType;

public class Misty extends GymLeader {


// call a specifc Poketeam constructor

    public Misty(){
        name = "Misty";
        level = 10;
        lootXP = rng.nextInt(500) + 1000;
        type = PokemonType.WATER;
        trainerType = TrainerType.GYM_LEADER;
        myTeam = new PokeTeam(new int[]{3,3,4});
    }


    @Override
    public void taunt() {
        System.out.println("Your Pokemon are so weak!");
    }

    @Override
    public void brag() {
        System.out.println("My water moves are the best");

    }

    @Override
    public void lose() {
        System.out.println("Im the best trainer around..... How did you learn those moves?");
    }
}
