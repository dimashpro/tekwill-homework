package com.tekwill.learning.games;

import java.util.Random;

public class DiceGame {
    public void throwDice() {

        Random random = new Random();

        int timeOfLoops = 0;
        int equality = 0;
        int counterComputerWins = 0;
        int counterUserWins = 0;

        do {
            int computerDiceValue = 1 + random.nextInt(5);
            int userDiceValue = 1 + random.nextInt(5);
            if (computerDiceValue > userDiceValue) {
                counterComputerWins++;
            } else if (computerDiceValue < userDiceValue) {
                counterUserWins++;
            } else {
                equality++;
            }

            timeOfLoops++;
        } while (timeOfLoops < 10);

        if (counterComputerWins > counterUserWins) {
            System.out.println("Computer won with " + counterComputerWins + " winning attempts.");
        } else if (counterComputerWins < counterUserWins) {
            System.out.println("User won with " + counterUserWins + " winning attempts.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
