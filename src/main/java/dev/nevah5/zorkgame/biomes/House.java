package dev.nevah5.zorkgame.biomes;

/**
 * @author Nevah5
 * House biome. This is the last biome the player has to discover/use.
 */
public class House extends Biome{
    public House(){
        super("🏠");
    }

    @Override
    public String getBiomeDesc(){
        return "🏠 House";
    }

    @Override
    public String getEnterBiomeStory(){ return "Oh, what is this? You found a lonely house."; }
}
