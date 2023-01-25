package dev.nevah5.zorkgame.biomes;

/**
 * @author Nevah5
 * Jungle biome.
 */
public class JungleBiome extends Biome{
    public JungleBiome(){
        super("🦟");
    }

    @Override
    public String getBiomeDesc(){
        return "🦟 Jungle";
    }

    @Override
    public String getEnterBiomeStory(){ return "You feel the humidity go up while you enter the Jungle. You have " +
            "to be careful."; }
}
