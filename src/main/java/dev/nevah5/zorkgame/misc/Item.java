package dev.nevah5.zorkgame.misc;

/**
 * Stores some information about the item.
 * @author Nevah5
 */
public class Item {
    private int maxStackSize;
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
}
