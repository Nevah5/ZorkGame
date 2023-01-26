package dev.nevah5.zorkgame.entities;

import lombok.Getter;

import java.util.Random;
import java.util.Scanner;

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
    public void fightMonster(Scanner scanner) {
        System.out.printf("You encountered a %s!%n", monsterName);
        System.out.println("Please select one of the following attacks:");
        System.out.println("1 - Banana");
        System.out.println("2 - Punch");
        System.out.println("3 - Kick");
        System.out.println("4 - Back-flip");
        Random random = new Random();
        int rng = random.nextInt(4);
        System.out.print("Selection: ");
        int selected = scanner.nextInt();
        if(rng != 3) isDefeated = true;
        if(selected == 1){
            System.out.println("You selected 'Banana'.");
            switch (rng){
                case 0 -> System.out.printf("You quickly take out a banana from your backpack. After eating it " +
                        "without hesitating, you throw the peel into the %s's face! It stumbles backwards and " +
                        "falls onto a rock with it's head.%n", monsterName);
                case 1 -> System.out.printf("You quickly take out a banana from your backpack and throw it " +
                        "onto the %s. It stumbles backwards and falls down.%n", monsterName);
                case 2 -> System.out.printf("You quickly take out a banana from your backpack. Then you offer it " +
                        "to the %s. You were lucky because it got distracted with the banana and you escaped.%n",
                        monsterName);
                case 3 -> System.out.printf("You quickly take out a banana from your backpack. You wanted to be kind " +
                        "to the %s and offer the banana to it. You were unlucky though and the %s doesn't like " +
                        "exotic fruits. It hits you in the head and you die.%n", monsterName, monsterName);
            }
        } else if (selected == 2){
            System.out.println("You selected 'Punch'.");
            switch (rng){
                case 0 -> System.out.printf("Without hesitating you punch the %s. I think it hurt because it " +
                        "runs away.%n", monsterName);
                case 1 -> System.out.printf("Your quick fists fire onto the %s. Hit after hit. The %s was quickly " +
                        "defeated.%n", monsterName, monsterName);
                case 2 -> System.out.printf("You punch the %s in the face. You defeated it.%n",
                        monsterName);
                case 3 -> System.out.printf("You tried to act quickly but the %s was quicker and defeated you.%n",
                        monsterName);
            }
        } else if (selected == 3){
            System.out.println("You selected 'Kick'.");
            switch (rng){
                case 0 -> System.out.printf("You kick the %s and win the fight.%n", monsterName);
                case 1 -> System.out.printf("After a quick kick into the %s's stomach, the fight is quickly " +
                        "ended. Good job!%n", monsterName);
                case 2 -> System.out.printf("You were lucky because you knew Kung Fu. After a tornado kick you " +
                                "defeat the %s. Good job!%n",
                        monsterName);
                case 3 -> System.out.printf("You tried to run across the wall beside you and kick the %s. Sadly you " +
                                "slipped and fell down onto your head.%n",
                        monsterName);
            }
        } else if (selected == 4){
            isDefeated = false;
            System.out.println("You selected 'back-flip'.");
            System.out.printf("You tried to back flip and impress the %s, but you failed and died because you hit " +
                    "your head on the ground.", monsterName);
        }
    }
}
