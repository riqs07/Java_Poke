package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.PokemonType;

public class GymTrainer extends PokeTrainer implements GymChatter{


    public GymTrainer(PokemonType type,int size){
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
