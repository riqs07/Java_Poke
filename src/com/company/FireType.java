package com.company;

public interface FireType {
    /** constants **/
    /** Type name String. */
    String FIRE_TYPE = new String("Fire");
    /** Type color String. */
    String FIRE_COLOR = new String("Orange");
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


}
