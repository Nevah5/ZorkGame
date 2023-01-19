package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.Map;
import dev.nevah5.zorkgame.entities.Player;
import dev.nevah5.zorkgame.enums.Direction;

import java.util.Scanner;

public class MoveCommand {
    public MoveCommand(Player player, Map map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("In which direction do you want to move?");
        System.out.println("n(orth)/e(ast)/s(outh)/w(est)");
        System.out.print("?> ");
        String dir = scanner.next();
        try{
            switch (dir){
                case "n" -> player.move(Direction.NORTH, map);
                case "e" -> player.move(Direction.EAST, map);
                case "s" -> player.move(Direction.SOUTH, map);
                case "w" -> player.move(Direction.WEST, map);
            }
        } catch (Throwable throwable){
            System.out.println("\u001B[31m"+throwable.getMessage());
        }
    }
}
