package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.entities.Monster;
import dev.nevah5.zorkgame.misc.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Biome {
    private List<Monster> monsters;
    private List<Item> items;
    @Getter
    private String icon;
    @Getter
    @Setter
    private Boolean hasVisited = false;

    public Biome(String icon){
        this.icon = icon;
    }

    public void printIcon(){
        if(!this.hasVisited) {
            System.out.print("❓");
        }else {
            System.out.print(this.icon);
        }
    }

    public String getBiomeDesc(){
        return "❓ Unnamed";
    }
}
