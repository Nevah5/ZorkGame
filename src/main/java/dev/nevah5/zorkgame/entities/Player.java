package dev.nevah5.zorkgame.entities;

import dev.nevah5.zorkgame.Map;
import dev.nevah5.zorkgame.enums.Direction;
import dev.nevah5.zorkgame.exceptions.InvalidPlayerMoveException;
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

    /**
     * Moves the player in the direction and checks if this is possible.
     * @param direction The enum direction where the player want to go
     */
    public void move(Direction direction, Map map) throws Throwable{
        if(direction == Direction.NORTH){
            if(playerLocation.getZ() == 0){
                throw new InvalidPlayerMoveException();
            }
            playerLocation.setZ(playerLocation.getZ()-1);
        } else if(direction == Direction.EAST){
            if(playerLocation.getX() == 7){
                throw new InvalidPlayerMoveException();
            }
            playerLocation.setX(playerLocation.getX()+1);
        } else if(direction == Direction.SOUTH){
            if(playerLocation.getZ() == 4){
                throw new InvalidPlayerMoveException();
            }
            playerLocation.setZ(playerLocation.getZ()+1);
        } else if(direction == Direction.WEST){
            if(playerLocation.getX() == 0){
                throw new InvalidPlayerMoveException();
            }
            playerLocation.setX(playerLocation.getX()-1);
        }
        map.getCurrentBiome().setHasVisited(true);
        System.out.printf("%s%n", map.getCurrentBiome().getEnterBiomeStory());
    }
}
