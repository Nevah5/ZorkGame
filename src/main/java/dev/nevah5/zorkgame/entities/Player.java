package dev.nevah5.zorkgame.entities;

import dev.nevah5.zorkgame.enums.Direction;
import dev.nevah5.zorkgame.tools.PlayerLocation;
import lombok.Getter;

public class Player {
    @Getter
    private final String playerName;
    @Getter
    private final PlayerLocation playerLocation = new PlayerLocation();

    public Player(String playerName){
        this.playerName = playerName;
    }

    public void walk(Direction direction){
        switch (direction){
            case NORTH -> playerLocation.setZ(playerLocation.getZ()+1);
            case EAST -> playerLocation.setZ(playerLocation.getX()+1);
            case SOUTH -> playerLocation.setZ(playerLocation.getZ()-1);
            case WEST -> playerLocation.setZ(playerLocation.getX()-1);
        }
    }
}
