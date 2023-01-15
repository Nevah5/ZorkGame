package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.enums.Color;

public class Cave extends Biome{
    public Cave(){
        super(Color.BLACK);
    }

    @Override
    public void printBiomeName(){
        System.out.print(this.getColor()+"Cave");
    }
}
