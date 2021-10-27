package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.Pokemon.Types.PokemonType;

public class Blaine extends GymLeader {


    public Blaine(){
        name = "Blaine";
        lootXP = rng.nextInt(500) + 1250;
        type = PokemonType.FIRE;
        myTeam = new PokeTeam(new int[]{2,1,5,5});
        badge = Badge.VOLCANO_BADGE;
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

    @Override
    public void victory() {

    }

    @Override
    public void battleLogic() {

    }
}
