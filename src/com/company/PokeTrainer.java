package com.company;

import java.util.Random;

public class PokeTrainer {
    String name;
    int level;
    PokeTeam myTeam = new PokeTeam(3);
    double lootXP;
    int luck;
    Random rng = new Random();
    PokemonType type;


    final int TEAM_MAX = 6;
    final int TEAM_MIN = 1;


    final String[] POSSIBLE_NAMES = {
            "Dave","Red","Misty","Ash","Brock"
    };


    //cons with size
    //cons with ids
    // default cons

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
