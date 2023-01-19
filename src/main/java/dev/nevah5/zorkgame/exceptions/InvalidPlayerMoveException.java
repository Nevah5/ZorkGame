package dev.nevah5.zorkgame.exceptions;

public class InvalidPlayerMoveException extends Throwable {
    public InvalidPlayerMoveException() throws Throwable{
        super("You cannot got further than this.");
    }
}
