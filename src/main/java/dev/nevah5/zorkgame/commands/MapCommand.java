package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.Map;

public class MapCommand {
    public MapCommand(Map map){
        map.updatePosition();
        map.printMap();
    }
}
