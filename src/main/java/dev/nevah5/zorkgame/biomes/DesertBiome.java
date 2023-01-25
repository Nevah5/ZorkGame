package dev.nevah5.zorkgame.biomes;

/**
 * Desert biome.
 * @author Nevah5
 */
public class DesertBiome extends Biome{
    public DesertBiome(){
        super("🏜️");
    }

    @Override
    public String getBiomeDesc(){
        return "🏜️ Desert";
    }

    @Override
    public String getEnterBiomeStory(){ return "Desperate to find water, you entered the hot Desert. In the distance" +
            " you can see a cactus."; }
}
