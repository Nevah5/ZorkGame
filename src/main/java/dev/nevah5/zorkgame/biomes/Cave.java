package dev.nevah5.zorkgame.biomes;

public class Cave extends Biome{
    public Cave(){
        super("⛰");
    }

    @Override
    public String getBiomeDesc(){
        return "⛰ Cave";
    }

    @Override
    public String getEnterBiomeStory(){ return "You entered a dark, scary cave. Bats scared you for a second."; }
}
