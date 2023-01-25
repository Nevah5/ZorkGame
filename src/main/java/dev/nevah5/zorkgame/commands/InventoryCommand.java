package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.entities.Player;

/**
 * This class prints out the inventory
 * @author Nevah5
 */
public class InventoryCommand {
    public InventoryCommand(Player player){
        player.getPlayerInventory().printInventory();
    }
}
