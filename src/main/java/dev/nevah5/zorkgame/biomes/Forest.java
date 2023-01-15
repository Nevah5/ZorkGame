package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.enums.Color;

public class Forest extends Biome{
    public Forest(){
        super(Color.GREEN);
    }

    @Override
    public void printBiomeName(){
        System.out.print(this.getColor()+"Forest");
    }
}
