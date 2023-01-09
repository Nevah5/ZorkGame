package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.tools.PlayerLocation;

public class Map {
    PlayerLocation playerLocation;
    public Map(PlayerLocation playerLocation){
        this.playerLocation = playerLocation;
    }

    public void printMap(){
        System.out.println("--MAP PRINT HERE--");
        System.out.println(String.format("You are at: %s %s", playerLocation.getX(), playerLocation.getZ()));
    }
}
