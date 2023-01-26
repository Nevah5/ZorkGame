package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.entities.PlayerEntity;

/**
 * This class prints out the inventory
 * @author Nevah5
 */
public class InventoryCommand {
    public InventoryCommand(PlayerEntity player){
        player.getPlayerInventory().printInventory();
    }
}
