package com.company.PokemonTrainers;

import com.company.PokemonType;

public class EnemyTrainer extends PokeTrainer implements EnemyTrainerChatter{
    final String[] POSSIBLE_NAMES = {
            "Dave","Red","Paulo","Ash","Bobby"
    };



    public enum TrainerType { GYM_TRAINER,GYM_LEADER,NORMAL,RIVAL}


    double lootXP;
    int level;
    TrainerType trainerType;
    PokemonType type;


    public EnemyTrainer(){
        this.name = POSSIBLE_NAMES[rng.nextInt(POSSIBLE_NAMES.length)];

    }
    public EnemyTrainer(int size){

    }




    @Override
    public void greeting() {
        System.out.println("Get ready to battle!");
    }

    @Override
    public void goodbye() {
        System.out.println("I can not understand how I lost");
    }


}
