package com.company.PokemonTrainers;

public class GymLeaderFactory {
    public GymLeader getGymLeader(String gymLeader){
        if (gymLeader == null ){
            return null;
        }

        if ( gymLeader.equalsIgnoreCase("MISTY")) return new Misty();
        if ( gymLeader.equalsIgnoreCase("BLAINE")) return new Blaine();

        return null;
    }
    }

