package dev.nevah5.zorkgame.commands;

/**
 * This is the class for the help command.
 * @author Nevah5
 */
public class HelpCommand {
    /**
     * Directly prints a list of all available
     * commands into the console.
     */
    public HelpCommand(){
        System.out.println("- Mᴏᴠᴇᴍᴇɴᴛ -");
        System.out.println("map - prints out the map and your location");
        System.out.println("move (n(orth)/e(ast)/s(outh)/w(est)) - moves the player into the desired direction");
        System.out.println("search - search in the player's location\n");
        System.out.println("- Iɴᴠᴇɴᴛᴏʀʏ -");
        System.out.println("inventory - lists the player's inventory");
    }
}
