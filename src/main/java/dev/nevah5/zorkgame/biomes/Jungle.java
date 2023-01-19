package dev.nevah5.zorkgame.biomes;

public class Jungle extends Biome{
    public Jungle(){
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
