package dev.nevah5.zorkgame.misc;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores the items that the player picked up.
 * @author Nevah5
 */
public class PlayerInventory {
    private List<Item> items = new ArrayList<>();
    @Getter
    private double weightInKg;

    /**
     * Picks up an item, weight gets added to the
     * inventory
     * @param item the item that the player picks up
     */
    public void pickup(Item item){
        weightInKg += item.getWeightInKg();
        items.add(item);
    }

    /**
     * Prints out the whole inventory to the console,
     * including the total weight.
     */
    public void printInventory(){
        System.out.printf("Yᴏᴜʀ Iɴᴠᴇɴᴛᴏʀʏ%nWeight: %s%n", weightInKg);
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            System.out.printf("%s - 1x %s [%skg]%n", i, item.getName(), item.getWeightInKg());
        }
    }
}
