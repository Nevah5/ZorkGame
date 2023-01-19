package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.entities.Player;
import dev.nevah5.zorkgame.misc.Map;
import dev.nevah5.zorkgame.tools.CommandHandler;
import lombok.Getter;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    @Getter
    private Map map;
    @Getter
    private Player player;
    public Game() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                \u001B[35mWELCOME TO
                ███████╗░█████╗░██████╗░██╗░░██╗
                ╚════██║██╔══██╗██╔══██╗██║░██╔╝
                ░░███╔═╝██║░░██║██████╔╝█████═╝░
                ██╔══╝░░██║░░██║██╔══██╗██╔═██╗░
                ███████╗╚█████╔╝██║░░██║██║░╚██╗
                ╚══════╝░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝
                                 Made by @Nevah5
                """);
        System.out.println("\u001B[35mTip: Type 'help' to find a list of commands available.");
        System.out.print("\u001B[35mLoading.");
        TimeUnit.SECONDS.sleep(1);
        for(int i = 0; i < 3; i++){
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }

        this.player = new Player("Player");

        this.map = new Map(player.getPlayerLocation());

        System.out.print("\n\n");

        CommandHandler commandHandler = new CommandHandler(this);
        do {
            try{
                System.out.print("\u001B[35m>>> ");
                String command = scanner.nextLine();
                commandHandler.runCommand(command);
            }catch (Throwable throwable){
                System.out.println("\u001B[31m"+throwable.getMessage());
            }
        } while(commandHandler.isGameRunning());

        System.out.println("\u001B[35mThanks for playing!");

        scanner.close();
    }

    private static void clearConsole(){
        for(int i = 0; i < 20; i++){
            System.out.println("\n");
        }
    }
}