package dev.nevah5.zorkgame.misc;

public class Item {
    private int maxStackSize;
    private String name;
    private double weightInKg;

    public Item(int maxStackSize, String name, double weightInKg){
        this.maxStackSize = maxStackSize;
        this.name = name;
        this.weightInKg = weightInKg;
    }
}
