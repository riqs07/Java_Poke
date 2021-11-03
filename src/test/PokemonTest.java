package test;

import com.company.Pokemon.Charizard;
import com.company.Pokemon.Charmander;
import com.company.Pokemon.Charmelion;
import com.company.Pokemon.Pokemon;
import org.hamcrest.core.IsInstanceOf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void levelUP() {
        Pokemon p = new Charmander();

        p.levelUP(1);
        assertEquals(2, p.currentLevel);
    }

    @Test
    void increaseXP() {
        Pokemon p = new Charmander();

        p.increaseXP(50);


        assertEquals(50,p.XP);
    }

    @Test
    void evolve() {
        Pokemon p = new Charmander();
        p = p.evolve();

        assertTrue(p instanceof Charmelion);

    }

    @Test
    void basicAttack(){
        Pokemon target = new Charmander();
        Pokemon origin = new Charizard();
        boolean didDamage = false;

        double startHP = target.currentHP;


//        origin.attack(target);


        if (startHP > target.currentHP){
            didDamage = true;
        }


        assertTrue(didDamage);
    }
}