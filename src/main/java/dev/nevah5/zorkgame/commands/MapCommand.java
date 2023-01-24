package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.misc.Map;

/**
 * This is the class for the map command.
 * @author Nevah5
 */
public class MapCommand {
    /**
     * Updates the player's position so that
     * it displays it on the map, then prints
     * it into the console.
     * @param map the current map from the game
     */
    public MapCommand(Map map){
        map.updatePosition();
        map.printMap();
    }
}
