package com.company.Pokemon;

import com.company.PokemonTrainers.GymLeader;
import com.company.PokemonTrainers.Misty;
import com.company.PokemonType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokeTeam {
    Pokemon p = null;
    List<Pokemon> myTeam = new ArrayList<>();

    /// Random Team Based on Size
    public PokeTeam(int size){
        Random rng = new Random();

        for (int i = 0; i < size;i++){
            int num = rng.nextInt(5);
            PokeDex pokemon = PokeDex.values()[num];

        // determine random pokemon
        // based on location?? based on trainer level???


            switch (pokemon) {
                case CHARMANDER -> p = new Charmander();
                case CHARMELION -> p = new Charmelion();
                case CHARIZARD -> p = new Charizard();
                case STARYU -> p = new Staryu();
                case STARMIE -> p = new Starmie();
                case ARBOK -> p = new Arbok();
            }

        myTeam.add(p);

    }

    }

    /// Random Team Based on Type
    public PokeTeam(PokemonType type,int size){

        int num;
        Random rng = new Random();

        for (int i= 0; i < size;i++) {

            switch (type){
                case WATER:
                    num = rng.nextInt(2);
                    switch (num) {
                        case 0 -> p = new Starmie();
                        case 1 -> p = new Staryu();
                    }

                    break;

                case FIRE:
                    num = rng.nextInt(3);
                    switch (num) {
                        case 0 -> p = new Charmander();
                        case 1 -> p = new Charmelion();
                        case 2 -> p = new Charizard();
                    }
                    break;

                case GRASS:
                    break;
                case GROUND:
                    break;
                case BUG:
                    break;
                case ELECTRIC:
                    break;
                case ICE:
                    break;
                case FIGHTING:
                    break;
                case DARK:
                    break;
                case DRAGON:
                    break;
                case ROCK:
                    break;
                case STEEL:
                    break;
                case PSYCHIC:
                    break;
                case FLYING:
                    break;
                case GHOST:
                    break;
                case FAIRY:
                    break;
                case POISON:
                    break;
            }
            myTeam.add(p);
        }




    }



    ///Specific Team


    /////////// GOAL ////////////////////////
    ///  1.Be able to create a specific list of pokemon.
    ///     a.Pokemon will be randomized but the chosen pokemon can be selected
    ///     b. if given list of pokemon is not the same as team size then ---> randomize the rest of the team
    //////////////////////////////////////////




    ///// THOUGHTS//////
    /// array list of pokemon ids? pass in that list and then build team based on ids
            //// huge swicch statement? based on enums?
    // loop thru array based on IDS
    /// build specific pokemon first ---> add those into a list ----> add list into a team constructor that randomized rest?
            //// would have to change every time




public PokeTeam(int[] pokeIDs){
    for (int pokeID : pokeIDs) {

        PokeDex pokemon = PokeDex.values()[pokeID];

        switch (pokemon) {
            case CHARMANDER:
                p = new Charmander();
                break;
            case CHARMELION:
                p = new Charmelion();
                break;
            case CHARIZARD:
                p = new Charizard();
                break;

            case STARYU:
                p = new Staryu();
                break;
            case STARMIE:
                p = new Starmie();
                break;

            case ARBOK:
                p = new Arbok();
                break;
        }

        myTeam.add(p);
    }


}


    public static void main(String[] args) {
        GymLeader Misty = new Misty();
        System.out.println(Misty);

    }














    // pick pokemon by ids


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
