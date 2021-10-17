package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.PokemonType;

public class Blaine extends GymLeader {


    public Blaine(){
        name = "Blaine";
        level = 10;
        lootXP = rng.nextInt(500) + 1250;
        type = PokemonType.FIRE;
        trainerType = TrainerType.GYM_LEADER;
        myTeam = new PokeTeam(new int[]{2,1,5});
    }



    @Override
    public void taunt() {
        System.out.println("I've had rug burns that hurt more than you.");
    }

    @Override
    public void brag() {
        System.out.println("If your afraid of fire, why face me?");
    }

    @Override
    public void lose() {
        System.out.println("Wow... maybe I underestimated you.");
    }
}
