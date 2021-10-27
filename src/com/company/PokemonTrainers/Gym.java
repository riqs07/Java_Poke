package com.company.PokemonTrainers;

import com.company.Game.EncounterArea;
import com.company.Game.TrainerEncounterArea;
import com.company.Pokemon.Types.PokemonType;

import java.util.Stack;

public class Gym extends EncounterArea {

    GymLeader gymLeader;
    PokemonType type;
    Stack<PokeTrainer> gymTrainers  = new Stack<>();
    Badge badge;





    
    ///need create list of poikemon trainers


    public Gym(PokemonType type,int size){
                switch (type) {
            case WATER -> {
                gymLeader = new Misty();
                badge = Badge.CASCADE_BADGE;
            }
            case FIRE -> {
                gymLeader = new Blaine();
                badge = Badge.VOLCANO_BADGE;
            }
        }
        gymTrainers.push(gymLeader);
        for (int i = 0;i <size - 1;i++){
            gymTrainers.push(new GymTrainer(type,3));
        }
    }


    public static void main(String[] args) {

    }
}
