package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.biomes.*;
import dev.nevah5.zorkgame.tools.PlayerLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Creates a new map for the player.
 * The map is built on a 8x5 grid, so
 * 40 tiles.
 */
public class Map {
    PlayerLocation playerLocation;
    List<Biome> biomes = new ArrayList<>();
    public Map(PlayerLocation playerLocation){
        this.playerLocation = playerLocation;

        Random random = new Random();
        //generate biomes
        for(int i = 1; i <= 40; i++) {
            int r = random.nextInt(4);
            switch (r) {
                case 0 -> biomes.add(new Cave());
                case 1 -> biomes.add(new Desert());
                case 2 -> biomes.add(new Forest());
                case 3 -> biomes.add(new Jungle());
            }
        }
        //generate house biome
        int x = random.nextInt(8);
        int y = random.nextInt(5);
        if(x == 0) x = 1;
        biomes.set(x*y+x, new House());
    }

    public void printMap(){
        // TODO: print Biome currently in
        for(int z = 1; z <= 5; z++){ //multiply is for printing 3 lines per biome
            for(int x = 1; x <= 8; x++){
                int i = (x-1)*(z-1)+x-1;
                int playerPos = (playerLocation.getX() - 1)*(playerLocation.getZ()-1)+playerLocation.getX()-1;
                if(x == 1) i = 8*(z-1)+x-1;
                // TODO: print X where player is at
                biomes.get(i).printIcon();
                if(x == 8) System.out.print("\n");
            }
        }
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", new Cave().getBiomeDesc(), new Desert().getBiomeDesc(),
                new Forest().getBiomeDesc(), new House().getBiomeDesc(), new Jungle().getBiomeDesc());
    }

    public void updatePosition(){
        int x = this.playerLocation.getX();
        int z = this.playerLocation.getZ();
        this.biomes.get(0).setHasVisited(true);
    }
}
