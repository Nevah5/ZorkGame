package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.entities.Player;

import java.util.Scanner;

public class DevelopmentApplication {
    public static void main(String[] args) {
        Player player = new Player("Nevah");
        Map map = new Map(player.getPlayerLocation());
        map.updatePosition();
        map.printMap();
        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            System.out.print("\n\u001B[0m>>> ");
            command = scanner.nextLine();
        } while(!command.equals(""));
    }
}
