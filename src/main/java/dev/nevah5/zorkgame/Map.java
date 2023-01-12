package dev.nevah5.zorkgame;

import dev.nevah5.zorkgame.biomes.Biome;
import dev.nevah5.zorkgame.biomes.Cave;
import dev.nevah5.zorkgame.biomes.Desert;
import dev.nevah5.zorkgame.tools.PlayerLocation;

import java.util.ArrayList;
import java.util.List;

public class Map {
    PlayerLocation playerLocation;
    List<Biome> biomes = new ArrayList<>();
    public Map(PlayerLocation playerLocation){
        this.playerLocation = playerLocation;

        //generate biomes
        for(int i = 1; i <= 25; i++){
            if(i % 5 == 0) {
                biomes.add(new Cave());
            }else {
                biomes.add(new Desert());
            }
        }

    }

    public void printMap(){
        System.out.printf("You are currently at: %s %s%n", playerLocation.getX(),
                playerLocation.getZ());
        for (Biome biome : biomes){
            if(biome instanceof Cave){
                System.out.println("-Cave");
            }else if (biome instanceof Desert){
                System.out.println("-Desert");
            }
        }
    }
}
