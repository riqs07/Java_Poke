package com.company.Pokemon;

import com.company.Pokemon.Types.PokemonType;
import com.company.PokemonTrainers.Blaine;

import java.util.Random;

public class PokemonFactory {
    public Pokemon createPokemon(PokeDex pokemon) {
        if (pokemon == null) {
            return null;
        }

        if (pokemon == PokeDex.CHARMANDER) return new Charmander();
        if (pokemon == PokeDex.CHARMELION) return new Charmelion();
        if (pokemon == PokeDex.CHARIZARD) return new Charizard();
        if (pokemon == PokeDex.PIKACHU) return new Pikachu();
        if (pokemon == PokeDex.PIKACHU) return new Charmelion();
        if (pokemon == PokeDex.STARMIE) return new Starmie();
        if (pokemon == PokeDex.STARYU) return new Staryu();
        if (pokemon == PokeDex.ARBOK) return new Arbok();


        return null;
    }

    public Pokemon createPokemonByType(PokemonType type) {

        int range = 0;
        Random rng = new Random();
        if (type == null) {
            return null;
        }


        switch (type) {

            case FIRE -> {
                range = rng.nextInt(3);
                switch (range) {
                    case 0:
                        return new Charmander();
                    case 1:
                        return new Charmelion();
                    case 2:
                        return new Charizard();
                }
            }

            case WATER -> {
                range = rng.nextInt(2);
                switch (range) {
                    case 0:
                        return new Staryu();
                    case 1:
                        return new Starmie();
                }

            }
        }


        return null;
    }
}
