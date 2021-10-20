package com.company.Game;

import com.company.Pokemon.Pokemon;
import com.company.PokemonTrainers.EnemyTrainer;
import com.company.PokemonTrainers.PokeTrainer;

import java.util.Stack;

public class PokemonEncounterArea extends EncounterArea{
    Stack<PokeTrainer> areaPokemon  = new Stack<>();


    public PokemonEncounterArea(int size){
        size = size;


        for (int i = 0;i <size - 1;i++){
//          need a way to pick pokemon based on location

        }

    }
}
