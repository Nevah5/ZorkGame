package dev.nevah5.zorkgame.exceptions;

public class CommandNotFoundException extends Throwable{
    public CommandNotFoundException(String message){
        super(message);
    }
}
