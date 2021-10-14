package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokeTeam {
    Pokemon p = null;
    List<Pokemon> myTeam = new ArrayList<Pokemon>();
    Random rng = new Random();

    public PokeTeam(int size){

        for (int i = 0; i < size;i++){
            int num = rng.nextInt(size);

        // determine random pokemon
        // based on location?? based on trainer level???


            switch (num){
                case 1:
                    p = new Charmander();
                    break;
                case 2:
                    p = new Pikachu();
                    break;
                case 3:
                    p = new Arbok();

                    break;
            }

        myTeam.add(p);

    }

    }

    public PokeTeam(int size,PokemonType type){



    };


    // pick pokemon by ids
    public PokeTeam(int[] pokeDexIDs){
        //insert array of ids and set trainer to have those pokemon
    };

    // Make an array list
    // decide random pokemon from diffrent list
    // add in random pokemon to array list
    // do that over and over till we hit size
    // helper functions to see what pokemon i have as well as hp
    //




/// FAKE AF LIST FUNCITONS
    public int size(){
        return myTeam.size();
    }

    public Pokemon get(int index){
        return myTeam.get(index);

    }




}
