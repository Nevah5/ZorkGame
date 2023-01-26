package dev.nevah5.zorkgame.entities;

import dev.nevah5.zorkgame.Game;
import dev.nevah5.zorkgame.biomes.HouseBiome;
import dev.nevah5.zorkgame.misc.Map;
import dev.nevah5.zorkgame.biomes.Biome;
import dev.nevah5.zorkgame.enums.Direction;
import dev.nevah5.zorkgame.exceptions.InvalidPlayerMoveException;
import dev.nevah5.zorkgame.misc.PlayerInventory;
import dev.nevah5.zorkgame.tools.PlayerLocation;
import lombok.Getter;

import java.util.List;

/**
 * The player class. Stores the name of the player
 * and the location.
 * @author Nevah5
 */
public class PlayerEntity {
    private final Game game;
    @Getter
    private final String playerName;
    @Getter
    private final PlayerLocation playerLocation = new PlayerLocation();
    @Getter
    private final PlayerInventory playerInventory = new PlayerInventory();

    public PlayerEntity(String playerName, Game game){
        this.playerName = playerName;
        this.game = game;
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
        Biome currentBiome = map.getCurrentBiome();
        if(!currentBiome.getHasVisited()) System.out.printf("%s%n", map.getCurrentBiome().getEnterBiomeStory());
        currentBiome.setHasVisited(true);

        if((currentBiome instanceof HouseBiome) && playerInventory.hasKey()){
            System.out.println("It looks like you have a key that fits the door.");
            System.out.println("You open the door.");
            System.out.println("\n");
            System.out.println("Congrats! You won!");
            game.setGameRunning(false);
        }

        if(currentBiome.hasMonsters()){
            List<MonsterEntity> monsters = currentBiome.getMonsters();
            do {
                MonsterEntity monsterToFight = monsters.get(monsters.size() - 1);
                monsterToFight.fightMonster();
                if(!monsterToFight.isDefeated()) {
                    game.setGameRunning(false);
                    return;
                }
                monsters.remove(monsterToFight);
            } while(monsters.size() >= 1);
        }
    }
}
