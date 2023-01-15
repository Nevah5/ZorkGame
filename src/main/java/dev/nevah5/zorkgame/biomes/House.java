package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.enums.Color;

public class House extends Biome{
    public House(){
        super(Color.BLUE);
    }

    @Override
    public void printBiomeName(){
        System.out.print(this.getColor()+"House");
    }
}
