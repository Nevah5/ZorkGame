package dev.nevah5.zorkgame.tools;

import lombok.Getter;
import lombok.Setter;

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

    public int getListIndex(){
        return 8*z+x;
    }
}
