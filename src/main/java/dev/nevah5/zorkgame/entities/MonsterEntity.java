package dev.nevah5.zorkgame.entities;

import lombok.Getter;

import java.util.Random;

public class MonsterEntity {
    private final String monsterName;
    @Getter
    private boolean isDefeated;

    public MonsterEntity(String monsterName){
        this.monsterName = monsterName;
    }

    /**
     * Fights the monster and gives the users options
     * to fight.
     */
    public void fightMonster(){
        System.out.printf("You encountered a %s!%n", monsterName);
        isDefeated = false;
        System.out.printf("You lost in the fight against the %s!%n", monsterName);
    }
}
