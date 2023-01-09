package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.entities.Player;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("PlayerNameHere");
        Map map = new Map(player.getPlayerLocation());
        map.printMap();
    }
}