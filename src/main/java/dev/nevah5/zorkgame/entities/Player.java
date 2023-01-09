package dev.nevah5.zorkgame.entities;

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
}
