package com.company.PokemonTrainers;

import com.company.Pokemon.Item;
import com.company.Pokemon.Items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<Item> getInventory() {
        return items;
    }

    public String getItemsString(){
        String s = "";

        for (int i= 0; i<getInventory().size();i++){
            s += i+1 + ". " + getInventory().get(i).name + "\t";
        }

        return s;
    }
    public void addPotion(int numOfPotions, Inventory inventory) {
        for (int i = 0; i < numOfPotions; i++) {
            inventory.getInventory().add(potion());
            inventory.getInventory().add(Rare_Candy());
            inventory.getInventory().add(hyperPotion());
        }
    }
    List<Item> items = new ArrayList<>();

public void buyItem(Items name,int playerGold){
    /// CHECK COST
    /// CALL ADD ITEM INTERNALLY


}
public void sellItem(){
    // REFIMD A PERCEMT COST
    // REMOVE ITEM FROM INVENTORY
}
public void showInventory(){}
public void useItem(){

}
public void addItem(){

}
    public void removeItem(){

    }


    private static Item potion() {
        return new Item(Items.POTION, "Potion", " a small vial filled with a " + "translucent red liquid","Increase HP by 50.",10);
    }

    private static Item hyperPotion() {
        return new Item(Items.HYPER_POTION, "Hyper Potion", " a small vial filled with a " + "translucent red liquid","Increase HP by 5.",6);
    }

    private static Item Rare_Candy() {
        return new Item(Items.POWER_BAR, "Rare Candy", " a small vial filled with a " + "translucent red liquid","Increase HP by 50.",10);
    }

    private static Item Poke_Ball() {
        return new Item(Items.POWER_BAR, "Poke Ball", " a small vial filled with a " + "translucent red liquid","Increase HP by 50.",5);
    }


}
