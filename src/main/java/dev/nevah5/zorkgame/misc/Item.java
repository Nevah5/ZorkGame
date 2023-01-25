package dev.nevah5.zorkgame.misc;

import lombok.Getter;

/**
 * Stores some information about the item.
 * @author Nevah5
 */
public class Item {
    @Getter
    private final String name;
    @Getter
    private final double weightInKg;

    /**
     * Creates a new item.
     * @param maxStackSize how many can be stacked at max
     * @param name the name of the item
     * @param weightInKg the weight per item
     */
    public Item(String name, double weightInKg){
        this.name = name;
        this.weightInKg = weightInKg;
    }

    /**
     * Inspect an item and gives a Description
     */
    public void inspect(){
        System.out.println("Something something.");
    }
}
