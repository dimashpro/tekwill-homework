package com.tekwill.learning.games;

import java.util.Random;

public class CrapsGame {
    public void throwDice() {

        Random random = new Random();
        int point;

        int firstDiceValue = 1 + random.nextInt(6);
        int secondDiceValue = 1 + random.nextInt(6);
        int diceSum = firstDiceValue + secondDiceValue;

        if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
            System.out.println("You rolled " + firstDiceValue + " + " + secondDiceValue + " = " + diceSum);
            System.out.println("You lose");

        } else if (diceSum == 7 || diceSum == 11) {
            System.out.println("You rolled " + firstDiceValue + " + " + secondDiceValue + " = " + diceSum);
            System.out.println("You win");
        } else {
            point = diceSum;
            System.out.println("You rolled " + firstDiceValue + " + " + secondDiceValue + " = " + diceSum);
            System.out.println("point is " + point);

            do {
                firstDiceValue = 1 + random.nextInt(6);
                secondDiceValue = 1 + random.nextInt(6);
                diceSum = firstDiceValue + secondDiceValue;
            } while (!(diceSum == 7 || diceSum == point));

            if (diceSum == point) {
                System.out.println("You rolled " + firstDiceValue + " + " + secondDiceValue + " = " + diceSum);
                System.out.println("You win");

            } else {
                System.out.println("You rolled " + firstDiceValue + " + " + secondDiceValue + " = " + diceSum);
                System.out.println("You lose");
            }
        }


    }
}
