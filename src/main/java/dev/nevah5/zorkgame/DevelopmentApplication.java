package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.entities.Player;

public class DevelopmentApplication {
    public static void main(String[] args) {
        Player player = new Player("Nevah");
        Map map = new Map(player.getPlayerLocation());
        map.updatePosition();
        map.printMap();
    }
}
