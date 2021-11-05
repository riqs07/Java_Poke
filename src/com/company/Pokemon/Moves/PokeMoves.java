package com.company.Pokemon.Moves;

import com.company.Pokemon.Types.MoveTypes;
import com.company.Pokemon.Types.PokemonType;

public class PokeMoves {


  public   static PokeAttacKMove pound(double atk) {
        double dmg = 150 + (.8 * atk);
        return new PokeAttacKMove("Flamethrower", dmg, 4, .80, PokemonType.NORMAL, MoveTypes.PHYSICAL);

    }

   public  static PokeAttacKMove bite(double atk) {
        double dmg = 150 + (.8 * atk + 50);
        return new PokeAttacKMove("Flamethrower", dmg, 4, .80, PokemonType.NORMAL, MoveTypes.PHYSICAL);
    }

   public  static PokeAttacKMove tackle(double atk) {
        double dmg = 75 + (.2 * atk);
        return new PokeAttacKMove("Ember", dmg, 4, .80, PokemonType.NORMAL, MoveTypes.PHYSICAL);

    }


 public    static PokeAttacKMove flamethrower(double spAtk) {
        double dmg = 150 + (.8 * spAtk);
        return new PokeAttacKMove("Flamethrower",dmg,4,.80, PokemonType.FIRE, MoveTypes.SPECIAL);

    }

   public  static PokeAttacKMove firePunch(double spAtk) {
        double dmg = 150 + (.8 * spAtk + 50);
        return new PokeAttacKMove("Flamethrower",dmg,4,.80,PokemonType.FIRE, MoveTypes.SPECIAL);
    }

  public   static PokeAttacKMove ember(double spAtk) {
        double dmg = 75 + (.2 * spAtk);
        return new PokeAttacKMove("Ember",dmg,4,.80,PokemonType.FIRE, MoveTypes.SPECIAL);

    }

    public static PokeAttacKMove thunder(double spAtk) {
        double dmg = 150 + (.8 * spAtk);
        return new PokeAttacKMove("Thunder",dmg,4,.80,PokemonType.ELECTRIC, MoveTypes.SPECIAL);

    }

 public    static PokeAttacKMove thunderbolt(double spAtk) {
        double dmg = 150 + (.8 * spAtk + 50);
        return new PokeAttacKMove("Thunderbolt",dmg,4,.80,PokemonType.ELECTRIC, MoveTypes.SPECIAL);
    }

  public   static PokeAttacKMove voltTackle(double spAtk) {
        double dmg = 75 + (.2 * spAtk);
        return new PokeAttacKMove("Volt Tackle",dmg,4,.80,PokemonType.ELECTRIC, MoveTypes.SPECIAL);

    }

  public   static PokeAttacKMove waterGun(double spAtk) {
        double dmg = 150 + (.8 * spAtk);
        return new PokeAttacKMove("Water Gun",dmg,4,.80,PokemonType.WATER, MoveTypes.SPECIAL);

    }

   public  static PokeAttacKMove surf(double spAtk) {
        double dmg = 150 + (.8 * spAtk + 50);
        return new PokeAttacKMove("Surf",dmg,4,.80,PokemonType.WATER, MoveTypes.SPECIAL);
    }

   public  static PokeAttacKMove hydroCannon(double spAtk) {
        double dmg = 75 + (.2 * spAtk);
        return new PokeAttacKMove("Hydro Cannon",dmg,4,.80,PokemonType.WATER, MoveTypes.SPECIAL);

    }


}
