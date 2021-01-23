package com.tekwill.learning.games;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {

    public static void guessNumber(int n) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = random.nextInt(n);
        boolean gameOver = true;

        do {
            System.out.println("Please enter your number:");
            int guessedNumber = scanner.nextInt();

            if (guessedNumber == generatedNumber) {
                System.out.println("Congratulations! You guessed the number! It is " + generatedNumber);
                gameOver = false;
            } else if (guessedNumber > generatedNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }

        } while (gameOver);
    }
}
