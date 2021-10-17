package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.PokemonType;

import java.util.Random;

public class PokeTrainer implements EnemyTrainerChatter {
    String name;
    int level;
    PokeTeam myTeam;
    double lootXP;
    int luck;
    Random rng = new Random();
    PokemonType type;
    TrainerType trainerType;


    final int TEAM_MAX = 6;
    final int TEAM_MIN = 1;

    // final var vs ENUMS?
    // inline enum?

    // make gym leaders but they are default
    // do i make them own object or pass in a bunch of values


    final String[] POSSIBLE_NAMES = {
            "Dave","Red","Paulo","Ash","Bobby"
    };

    public PokeTrainer() {

    }


    @Override
    public void greeting() {
        System.out.println("Get ready to battle!");
    }

    @Override
    public void goodbye() {
        System.out.println("I can not understand how I lost");
    }

    public enum TrainerType { GYM_TRAINER,GYM_LEADER,NORMAL,RIVAL}


//    enum GYM_LEADERS {
//        name = "Misty"
//
//    }

    //cons with size
    //cons with ids
    // default cons



//    what i want to do is pick a random pre determined gym leader
//
//    {name= "misty",
//    pokeType = "water",
//        etc
//    }

    // method to report team
    // get avg level and stats on team

    public PokeTrainer(int size){
        this.name = POSSIBLE_NAMES[rng.nextInt(POSSIBLE_NAMES.length)];

    }




    public void getTeam(){

        for (int i = 0;i < myTeam.size(); i++){
            System.out.println(myTeam.get(i));
        }


    }

//    public PokeTrainer(){
//        myTeam = new PokeTeam(3);
//    }



}
