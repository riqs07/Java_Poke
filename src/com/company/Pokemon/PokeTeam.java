package com.company.Pokemon;

import com.company.PokemonTrainers.GymLeader;
import com.company.PokemonTrainers.Misty;
import com.company.PokemonTrainers.PokeTrainer;
import com.company.PokemonType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokeTeam {
    Pokemon p = null;
    List<Pokemon> pokemonArrayList = new ArrayList<>();
    Pokemon currentPoke;
    final int TEAM_MAX = 6;
    final int TEAM_MIN = 1;


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

        pokemonArrayList.add(p);

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
            pokemonArrayList.add(p);
        }




    }

// Specific Team
public PokeTeam(int[] pokeIDs){
    for (int pokeID : pokeIDs) {

        PokeDex pokemon = PokeDex.values()[pokeID];

        switch (pokemon) {
            case CHARMANDER -> p = new Charmander();
            case CHARMELION -> p = new Charmelion();
            case CHARIZARD -> p = new Charizard();
            case STARYU -> p = new Staryu();
            case STARMIE -> p = new Starmie();
            case ARBOK -> p = new Arbok();
        }

        pokemonArrayList.add(p);
    }


}

public PokeTeam(){

}
    public static void main(String[] args) {
        GymLeader Misty = new Misty();
        System.out.println(Misty);

    }



/// FAKE AF LIST FUNCITONS
    public int size(){
        return pokemonArrayList.size();
    }

    public Pokemon get(int index){
        return pokemonArrayList.get(index);

    }

    public void addPokemon(Pokemon p){
        if (pokemonArrayList.size() == 0){
            currentPoke = p;
        }

        if (pokemonArrayList.size() < TEAM_MAX){
            pokemonArrayList.add(p);
        } else {
            System.out.println("NO pokemon added. Team is Full.");
        }
    }

    public Pokemon getCurrentPoke() {
        return currentPoke;
    }

    public void setCurrentPoke(int index) {
        // Loop thru array for same pokemon
        for (int i = 0; i < pokemonArrayList.size(); i++){
            if (currentPoke.uuid == pokemonArrayList.get(i).uuid){
                pokemonArrayList.get(i).currentHP = currentPoke.currentHP;
            }
        }

        if (pokemonArrayList.get(index).currentHP > 0){
            currentPoke = pokemonArrayList.get(index);
        }
    }

    public void getMyTeam(){
        String s = "";
        for (int i = 0; i < pokemonArrayList.size(); i++){
           s += pokemonArrayList.get(i).name +" HP: " + pokemonArrayList.get(i).currentHP +"\n";
        }
        System.out.println(s);
    }

    public void healAllPokemon(){
        for (Pokemon poke:pokemonArrayList){
            poke.currentHP = poke.maxHP;
        }
    }

    public void showCurrentPokemonStats(){
        currentPoke.getPokeStats();
    }
    public void showAllPokemonStats(){
        for (Pokemon poke:pokemonArrayList){
            poke.showQuickStats();
        }
    }
}
