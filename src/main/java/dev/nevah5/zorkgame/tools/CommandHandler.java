package dev.nevah5.zorkgame.tools;

import dev.nevah5.zorkgame.Game;
import dev.nevah5.zorkgame.commands.HelpCommand;
import dev.nevah5.zorkgame.commands.MapCommand;
import dev.nevah5.zorkgame.commands.MoveCommand;
import dev.nevah5.zorkgame.commands.SearchCommand;
import dev.nevah5.zorkgame.exceptions.CommandNotFoundException;
import lombok.Getter;

/**
 * Handles commands.
 * @author Nevah5
 */
public class CommandHandler {
    private Game game;
    @Getter
    private boolean gameRunning = true;
    public CommandHandler(Game game){
        this.game = game;
    }

    /**
     * Runs a command, else throws an exception
     * @param command the command
     * @throws Throwable throws different exceptions
     */
    public void runCommand(String command) throws Throwable {
        switch (command){
            case "help", "h", "?" -> new HelpCommand();
            case "q", "quit", "end", "stop" -> this.gameRunning = false;
            case "map" -> new MapCommand(this.game.getMap());
            case "move" -> new MoveCommand(game.getPlayer(), game.getMap());
            case "move n", "move e", "move s", "move w" ->
                new MoveCommand(game.getPlayer(), game.getMap(), command.split(" ")[1]);
            case "search" -> new SearchCommand(game.getPlayer(), game.getMap());
            default -> throw new CommandNotFoundException(String.format("The command '%s' was not found!",
                    command));
        }
    }
}
