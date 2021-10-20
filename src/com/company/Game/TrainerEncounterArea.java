package com.company.Game;

import com.company.PokemonTrainers.EnemyTrainer;
import com.company.PokemonTrainers.PokeTrainer;

import java.util.Stack;

public class TrainerEncounterArea extends EncounterArea {
    Stack<PokeTrainer> areaTrainers  = new Stack<>();


    public TrainerEncounterArea(int size){
        size = size;


        for (int i = 0;i <size - 1;i++){
            areaTrainers.push(new EnemyTrainer());
        }

    }
}
