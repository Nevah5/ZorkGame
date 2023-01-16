package dev.nevah5.zorkgame.tools;

import dev.nevah5.zorkgame.Game;
import dev.nevah5.zorkgame.commands.HelpCommand;
import dev.nevah5.zorkgame.exceptions.CommandNotFoundException;
import lombok.Getter;

public class CommandHandler {
    private Game game;
    @Getter
    private boolean gameRunning = true;
    public CommandHandler(Game game){
        this.game = game;
    }

    public void runCommand(String command) throws CommandNotFoundException {
        switch (command){
            case "help", "h", "?" -> new HelpCommand();
            case "q", "quit", "end", "stop" -> this.gameRunning = false;
            default -> throw new CommandNotFoundException(String.format("The command '%s' was not found!",
                    command));
        }
    }
}
