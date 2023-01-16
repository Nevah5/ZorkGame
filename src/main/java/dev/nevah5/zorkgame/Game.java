package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.entities.Player;
import dev.nevah5.zorkgame.exceptions.CommandNotFoundException;
import dev.nevah5.zorkgame.tools.CommandHandler;
import lombok.Getter;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    @Getter
    private Map map;
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

        TimeUnit.SECONDS.sleep(2);

        this.player = new Player("Player");

        System.out.println("\u001B[35mTip: Type 'help' to find a list of commands available.");
        System.out.print("\u001B[35mLoading.");
        for (int i = 0; i < 5; i++){
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            if(i == 3) for(int j = 0; j < 3; j++){
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
            }
        }

        this.map = new Map(player.getPlayerLocation());

        System.out.print("\n\n");

        CommandHandler commandHandler = new CommandHandler(this);
        do {
            try{
                System.out.print("\u001B[35m>>> ");
                String command = scanner.next();
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