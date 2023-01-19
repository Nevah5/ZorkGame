package dev.nevah5.zorkgame.exceptions;

public class InvalidCommandSyntaxException extends Throwable{
    public InvalidCommandSyntaxException(String syntax){
        super("Invalid command syntax. Please use '"+syntax+"'!");
    }
}
