package com.company.Pokemon.Types;

import com.company.Pokemon.Moves.PokeAttacKMove;

public interface BattleTypes {

    enum MoveTypes {PHYSICAL, SPECIAL}

    static PokeAttacKMove pound(double atk) {
        double dmg = 150 + (.8 * atk);
        return new PokeAttacKMove("Flamethrower", dmg, 4, .80, PokemonType.NORMAL, MoveTypes.PHYSICAL);

    }

    static PokeAttacKMove bite(double atk) {
        double dmg = 150 + (.8 * atk + 50);
        return new PokeAttacKMove("Flamethrower", dmg, 4, .80, PokemonType.NORMAL, MoveTypes.PHYSICAL);
    }

    static PokeAttacKMove tackle(double atk) {
        double dmg = 75 + (.2 * atk);
        return new PokeAttacKMove("Ember", dmg, 4, .80, PokemonType.NORMAL, MoveTypes.PHYSICAL);

    }
}
