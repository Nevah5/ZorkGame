package dev.nevah5.zorkgame.biomes;

/**
 * Forest biome.
 * @author Nevah5
 */
public class Forest extends Biome{
    public Forest(){
        super("🌳");
    }

    @Override
    public String getBiomeDesc(){
        return "🌳 Forest";
    }

    @Override
    public String getEnterBiomeStory(){ return "Tall trees shoot up in the sky. A Forest. You hear birds in the " +
            "distance."; }
}
