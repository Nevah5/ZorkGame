package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.entities.Monster;
import dev.nevah5.zorkgame.misc.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Biome class. It stores the monsters, items, emoji icon and
 * if the player has visited the biome yet.
 * @author Nevah5
 */
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

    /**
     * Prints the icon of the biome.
     * if the biome is still unvisited,
     * it prints a question mark emoji.
     */
    public void printIcon(){
        if(!this.hasVisited) {
            System.out.print("❓");
        }else {
            System.out.print(this.icon);
        }
    }

    /**
     * This function should be overwritten
     * by the "child" biome classes.
     * @return Biome icon with the name
     */
    public String getBiomeDesc(){
        return "❓ Unnamed";
    }

    /**
     * Gives back a small story that should be displayed
     * when the player enters the biome for the first time.
     * @return Story when the player enters a biome for the first time
     */
    public String getEnterBiomeStory(){ return "You entered something unknown."; }
}
