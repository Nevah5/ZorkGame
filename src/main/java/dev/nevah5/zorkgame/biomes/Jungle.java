package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.enums.Color;

public class Jungle extends Biome{
    public Jungle(){
        super(Color.CYAN);
    }

    @Override
    public void printBiomeName(){
        System.out.print(this.getColor()+"Jungle");
    }
}
