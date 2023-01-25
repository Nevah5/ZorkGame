package dev.nevah5.zorkgame.misc;

import lombok.Getter;

/**
 * Stores some information about the item.
 * @author Nevah5
 */
public class Item {
    private int maxStackSize;
    @Getter
    private String name;
    private double weightInKg;

    /**
     * Creates a new item.
     * @param maxStackSize how many can be stacked at max
     * @param name the name of the item
     * @param weightInKg the weight per item
     */
    public Item(int maxStackSize, String name, double weightInKg){
        this.maxStackSize = maxStackSize;
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
