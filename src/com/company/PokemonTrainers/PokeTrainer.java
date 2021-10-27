package com.company.PokemonTrainers;

import com.company.Game.TravelLocation;
import com.company.Pokemon.Item;
import com.company.Pokemon.PokeTeam;
import com.company.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokeTrainer  {
    String name;
    public PokeTeam myTeam = new PokeTeam();



    Random rng = new Random();

   public  Inventory inventory = new Inventory();


    // final var vs ENUMS?
    // inline enum?

    public PokeTrainer() {

    }


    public void swapPokemon(int targetIndex){
        myTeam.setCurrentPoke(targetIndex);
    }

    public void useItem(Item i , Pokemon p){

    }


    public void getTeam(){

        for (int i = 0;i < myTeam.size(); i++){
            System.out.println(myTeam.get(i));
        }


    }

}
