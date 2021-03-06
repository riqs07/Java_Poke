package com.company.PokemonTrainers;

import com.company.Pokemon.PokeTeam;
import com.company.Pokemon.Pokemon;
import com.company.Pokemon.PokemonFactory;
import com.company.Pokemon.Types.PokemonType;

import java.util.Random;

public class EnemyTrainer extends PokeTrainer implements EnemyTrainerChatter{
    final String[] POSSIBLE_NAMES = {
            "Dave","Red","Paulo","Ash","Bobby"
    };

    public enum TrainerType { GYM_TRAINER,GYM_LEADER,NORMAL,RIVAL}


    double lootXP;
    int level;
    TrainerType trainerType;
    PokemonType type;
    Random rng = new Random();


    /// Random Team Max 4 Pokemon
    public EnemyTrainer(){
        this.name = POSSIBLE_NAMES[rng.nextInt(POSSIBLE_NAMES.length)];
        myTeam = new PokeTeam(rng.nextInt(5));

    }


    /// Random Team Max n Pokemon
    public EnemyTrainer(int size){
        this.name = POSSIBLE_NAMES[rng.nextInt(POSSIBLE_NAMES.length)];
        myTeam = new PokeTeam(size);
    }

    // Enemey trainer based on type
    public EnemyTrainer(PokemonType type,int size){
        this.name = POSSIBLE_NAMES[rng.nextInt(POSSIBLE_NAMES.length)];
        this.type = type;
        myTeam = getTeamByType(size);
    }


    public int getIndexofPokewithMostHP(){
// Loop thur to find poke with most hp
        // return index so i can swap to this poke and give enemy some smarts
        return 2;
    }

    public PokeTeam getTeamByType(int size) {
        PokemonFactory factory = new PokemonFactory();
        PokeTeam newTeam = new PokeTeam();
        for (int i = 0;i < size;i++){
            Pokemon p = factory.createPokemonByType(this.type);
            newTeam.addPokemon(p);

        }

        return newTeam;
    }

    @Override
    public void greeting() {
        System.out.println("Get ready to battle!");
    }

    @Override
    public void goodbye() {
        System.out.println("I can not understand how I lost");
    }


}
