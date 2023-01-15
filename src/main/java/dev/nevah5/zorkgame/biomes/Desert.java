package dev.nevah5.zorkgame.biomes;

import dev.nevah5.zorkgame.enums.Color;

public class Desert extends Biome{
    public Desert(){
        super(Color.YELLOW);
    }

    @Override
    public void printBiomeName(){
        System.out.print(this.getColor()+"Desert");
    }
}
