package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.biomes.Biome;
import dev.nevah5.zorkgame.entities.PlayerEntity;
import dev.nevah5.zorkgame.misc.Item;
import dev.nevah5.zorkgame.misc.Map;

import java.util.List;

/**
 * Command class that searches the biome for items.
 * @author Nevah5
 */
public class SearchCommand {
    /**
     * Searches a biome for items and adds them to the player's inventories.
     * @param player to store the items found in the player's inventory
     * @param map the map to get the biome and check if there are items
     */
    public SearchCommand(PlayerEntity player, Map map){
        Biome biome = map.getCurrentBiome();
        List<Item> items = biome.getItems();
        if(items.size() == 0) {
            System.out.println("You gave up searching, because there is nothing here.");
            return;
        };

        Item itemFound = items.get(items.size() -1);
        items.remove(items.size() - 1);
        System.out.printf("It looks like you found '%s'!%n", itemFound.getName());
        itemFound.inspect();
        System.out.println("You picked up the item and it has been added to your inventory!");
        player.getPlayerInventory().pickup(itemFound);
    }
}
