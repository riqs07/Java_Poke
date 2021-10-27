package com.company.PokemonTrainers;

public abstract class GymLeader extends EnemyTrainer implements GymLeaderLogic {

    Badge badge;
    public GymLeader(){
        trainerType = TrainerType.GYM_LEADER;

    }

}
