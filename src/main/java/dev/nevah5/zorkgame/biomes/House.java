package dev.nevah5.zorkgame.biomes;

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
