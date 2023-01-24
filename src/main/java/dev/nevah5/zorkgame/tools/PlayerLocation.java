package dev.nevah5.zorkgame.tools;

import lombok.Getter;
import lombok.Setter;

/**
 * Stores the location of a player.
 * @author Nevah5
 */
public class PlayerLocation {
    /**
     * The player's x location.
     * Starts at 0, is not higher than 7.
     */
    @Getter
    @Setter
    private int x;
    /**
     * The player's z location.
     * Starts at 0, is not higher than 4.
     */
    @Getter
    @Setter
    private int z;

    /**
     * Returns the index for the biome ArrayList, where the player is located at.
     * @return index for the biome ArrayList
     */
    public int getListIndex(){
        return 8*z+x;
    }
}
