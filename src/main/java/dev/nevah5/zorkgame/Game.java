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
        System.out.println("To know you a little bit better, I would like to know your name:");
        String name = scanner.next();

        while(name.equals("")){
            System.out.println("This name is invalid. Please try again:");
            name = scanner.next();
        }

        Player player = new Player(name);

        TimeUnit.SECONDS.sleep(1);

        System.out.println("Hm, what a nice name.");
        TimeUnit.SECONDS.sleep(2);

        clearConsole();

        System.out.printf("Welcome '%s' to the world of Zork!%n", name);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Sadly, no one has made a map yet, maybe you can bring one back after your adventure.");
        TimeUnit.SECONDS.sleep(1);
        System.out.printf("Now, I wish you good luck. Good bye, %s%n", name);
        TimeUnit.SECONDS.sleep(5);
        System.out.println("\n* you leave without looking back, with much confidence in your skills");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Tip: Type 'help' to find a list of commands available.");
        System.out.print("Loading.");
        for (int i = 0; i < 5; i++){
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            if(i == 3) for(int j = 0; j < 3; j++){
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
            }
        }

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