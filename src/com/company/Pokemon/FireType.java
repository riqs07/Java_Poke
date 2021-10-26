package com.company.Pokemon;

public interface FireType {


    /** Array of type fast attack names. */
    String[] FIRE_FAST_ATTACKS = {"Ember", "Fire Fang"};
    /** Array of type special attack names. */
    String[] FIRE_SPECIAL_ATTACKS = {"Fire Blast", "Fire Punch",
            "Flame Burst", "Flame Charge",
            "Flame Wheel", "Flame Thrower", "Heat Wave"};
    /** Array of fast attack powers, coincides with name array. */
    int[] FIRE_FAST_ATK_POWER = {10, 10};
    /** Array of special attack powers, coincides with name array. */
    int[] FIRE_SPECIAL_BASE_DMG = {100, 40, 30, 25, 40, 55, 80};

    double SpATKModifier = 1.4;
    double HPModifier = 1.2;
    double ATKModifier = 1.0;
    double DEFModifier = 0.9;
    double SpDEFModifier = 0.8;




}
