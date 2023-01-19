package dev.nevah5.zorkgame.tools;

import lombok.Getter;
import lombok.Setter;

public class PlayerLocation {
    @Getter
    @Setter
    private int x;
    @Getter
    @Setter
    private int z;

    public int getListIndex(){
        return (x - 1)*(z-1)+x-1;
    }
}
