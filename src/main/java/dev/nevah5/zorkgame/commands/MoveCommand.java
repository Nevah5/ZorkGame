package dev.nevah5.zorkgame.commands;

import dev.nevah5.zorkgame.misc.Map;
import dev.nevah5.zorkgame.entities.Player;
import dev.nevah5.zorkgame.enums.Direction;
import dev.nevah5.zorkgame.exceptions.InvalidCommandSyntaxException;
import dev.nevah5.zorkgame.exceptions.InvalidPlayerMoveException;

import java.util.Scanner;
/**
 * This is the class for the move command.
 * @author Nevah5
 */
public class MoveCommand {
    /**
     * Gives the user a promt to where he wants
     * to move. Then moves accordingly.
     * @param player the player
     * @param map the map from the game
     */
    public MoveCommand(Player player, Map map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("In which direction do you want to move?");
        System.out.println("n(orth)/e(ast)/s(outh)/w(est)");
        System.out.print(">>> ");
        String dir = scanner.nextLine();
        try{
            switch (dir){
                case "n" -> player.move(Direction.NORTH, map);
                case "e" -> player.move(Direction.EAST, map);
                case "s" -> player.move(Direction.SOUTH, map);
                case "w" -> player.move(Direction.WEST, map);
                default -> throw new Throwable();
            }
        } catch (Throwable throwable){
            if(throwable instanceof InvalidPlayerMoveException){
                System.out.println("\u001B[31m"+throwable.getMessage());
            } else {
                System.out.println("\u001B[31mAn unexpected error ocurred.");
            }
        }
    }

    /**
     * Gives the user a promt to where he wants
     * to move. Then moves accordingly.
     * @param player the player
     * @param map the map from the game
     */
    public MoveCommand(Player player, Map map, String param1) {
        try{
            switch (param1){
                case "n" -> player.move(Direction.NORTH, map);
                case "e" -> player.move(Direction.EAST, map);
                case "s" -> player.move(Direction.SOUTH, map);
                case "w" -> player.move(Direction.WEST, map);
                default -> throw new InvalidCommandSyntaxException("move [n/e/s/w]");
            }
        } catch (Throwable throwable){
            if(throwable instanceof InvalidPlayerMoveException){
                System.out.println("\u001B[31m"+throwable.getMessage());
            } else if(throwable instanceof InvalidCommandSyntaxException){
                System.out.println("\u001B[31m"+throwable.getMessage());
            } else {
                System.out.println("\u001B[31mAn unexpected error ocurred.");
            }
        }
    }
}
