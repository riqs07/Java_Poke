package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.Pokemon.Types.PokemonType;

public class GymTrainer extends EnemyTrainer implements GymChatter{


    public GymTrainer(PokemonType type,int size){
        lootXP = rng.nextInt(500) + 150;
        trainerType = TrainerType.GYM_TRAINER;
        this.type = type;
        myTeam = new PokeTeam(type,size);
    }


    @Override
    public void taunt() {

    }

    @Override
    public void brag() {

    }

    @Override
    public void lose() {

    }
}
