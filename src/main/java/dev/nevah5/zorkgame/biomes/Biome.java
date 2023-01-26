package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.entities.MonsterEntity;
import dev.nevah5.zorkgame.misc.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Biome class. It stores the monsters, items, emoji icon and
 * if the player has visited the biome yet.
 * @author Nevah5
 */
public class Biome {
    @Getter
    private List<MonsterEntity> monsters;
    @Getter
    private List<Item> items = new ArrayList<>();
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


    /**
     * Returns boolean if biome has monsters
     * @return boolean if biome has monsters
     */
    public boolean hasMonsters(){
        return monsters.size() >= 1;
    }
}
