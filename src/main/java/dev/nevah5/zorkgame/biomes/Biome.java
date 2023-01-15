package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.entities.Monster;
import dev.nevah5.zorkgame.enums.Color;
import dev.nevah5.zorkgame.misc.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Biome {
    private List<Monster> monsters;
    private List<Item> items;
    @Getter
    private String color;
    @Getter
    @Setter
    private Boolean hasVisited = false;

    public Biome(Color color){
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String GREEN = "\u001B[32m";
        String CYAN = "\u001B[36m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String WHITE = "\u001B[37m";
        String BLACK = "\u001B[30m";
        String RESET = "\u001B[0m";

        if(color == Color.RED) this.color = RED;
        if(color == Color.YELLOW) this.color = YELLOW;
        if(color == Color.GREEN) this.color = GREEN;
        if(color == Color.CYAN) this.color = CYAN;
        if(color == Color.BLUE) this.color = BLUE;
        if(color == Color.PURPLE) this.color = PURPLE;
        if(color == Color.WHITE) this.color = WHITE;
        if(color == Color.BLACK) this.color = BLACK;
        if(color == Color.RESET) this.color = RESET;
    }

    public void printBiomeTileLine(){
        if(!this.hasVisited) {
            System.out.print("\u001B[0m███████");
        }else {
            System.out.print(this.color+"███████");
        }
    }
    public void printBiomeTileLineMiddle(){
        if(!this.hasVisited) {
            System.out.print("\u001B[0m███?███");
        }else {
            System.out.print(this.color+"███████");
        }
    }

    public void printBiomeName(){
        System.out.print("Unnamed");
    }
}
