package dev.nevah5.zorkgame.entities;

import lombok.Getter;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MonsterEntity {
    private final String monsterName;
    @Getter
    private boolean isDefeated = false;

    public MonsterEntity(String monsterName){
        this.monsterName = monsterName;
    }

    /**
     * Fights the monster and gives the users options
     * to fight.
     */
    public void fightMonster() throws InterruptedException {
        System.out.printf("You encountered a %s!%n", monsterName);
        TimeUnit.SECONDS.sleep(1);
        Random random = new Random();
        int winInt = random.nextInt(10);
        if(winInt == 0){
            System.out.printf("After an epic battle you lost against the %s!%n%n", monsterName);
            return;
        }
        int fightingAction = random.nextInt(5);
        switch (fightingAction){
            case 0 -> System.out.printf("You punch the %s and it dies.%n", monsterName);
            case 1 -> System.out.printf("You kick the %s and it dies.%n", monsterName);
            case 2 -> System.out.printf("You jump onto the %s and it dies.%n", monsterName);
            case 3 -> System.out.printf("You run behind the %s, you take your pocket knife, stab it and it dies.%n",
                    monsterName);
            case 4 -> System.out.printf("The %s just dies in front of you.%n", monsterName);
        }
        isDefeated = true;
    }
}
