package com.company.Game;

import com.company.Pokemon.Types.PokemonType;
import com.company.PokemonTrainers.EnemyTrainer;
import com.company.PokemonTrainers.PokeTrainer;

import java.util.Stack;

public class TrainerEncounterArea extends EncounterArea {
    Stack<PokeTrainer> areaTrainers  = new Stack<>();


    /// Random Traienrs
    public TrainerEncounterArea(int size){
        size = size;


        for (int i = 0;i <size - 1;i++){
            areaTrainers.push(new EnemyTrainer());
        }

    }

    /// Trainer Area based on type...
    //// Beach Volcano .. water // fire
    public TrainerEncounterArea(PokemonType type,int teamSize,int amountofTrainers){



        for (int i = 0;i < amountofTrainers ;i++){
            areaTrainers.push(new EnemyTrainer(type,teamSize));
        }

    }

    public static void main(String[] args) {
        TrainerEncounterArea g = new TrainerEncounterArea(PokemonType.FIRE,4,6);
    }
}
