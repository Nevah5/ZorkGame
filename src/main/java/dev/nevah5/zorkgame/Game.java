package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.entities.Player;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                WELCOME TO
                ███████╗░█████╗░██████╗░██╗░░██╗
                ╚════██║██╔══██╗██╔══██╗██║░██╔╝
                ░░███╔═╝██║░░██║██████╔╝█████═╝░
                ██╔══╝░░██║░░██║██╔══██╗██╔═██╗░
                ███████╗╚█████╔╝██║░░██║██║░╚██╗
                ╚══════╝░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝
                                 Made by @Nevah5
                """);

        TimeUnit.SECONDS.sleep(2);
        clearConsole();

        System.out.println("Welcome Stranger!");
        System.out.println("To know you a little bit better, I would like to know your name.\n");
        String name = scanner.nextLine();

        while(name.equals("")){
            System.out.println("This name is invalid. Please try again.");
            name = scanner.nextLine();
        }

        Player player = new Player(name);

        TimeUnit.SECONDS.sleep(1);

        System.out.println("Hm, what a nice name.");
        TimeUnit.SECONDS.sleep(2);

        clearConsole();

        System.out.println(String.format("Welcome %s to the world of Zork!", name));

        Map map = new Map(player.getPlayerLocation());
        map.printMap();
        scanner.close();
    }

    private static void clearConsole(){
        for(int i = 0; i < 20; i++){
            System.out.println("\n");
        }
    }
}