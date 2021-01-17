package com.tekwill.learning.methods;

import java.util.Scanner;

public class ExtrasensoryPerceptionGameDemo {

    public static void main(String[] args) {
        int goodAnswer = 0;
        int badAnswer = 0;
        int attemptsNumber = 0;
        String computerColor, userColor;

        System.out.println("Extrasensory Perception Game.");
        Scanner scanner = new Scanner(System.in);

        while (attemptsNumber < 10) {

            System.out.print("Please select a color (red, green, blue, orange, yellow): ");

            userColor = ExtrasensoryPerceptionGame.userChoice(scanner.nextLine());
            computerColor = ExtrasensoryPerceptionGame.computerChoice();

            if (userColor.equals(computerColor)) {
                goodAnswer++;
                System.out.println("You guessed!");
            } else {
                System.out.println("You did not guessed.");
                badAnswer++;
            }
            attemptsNumber = goodAnswer + badAnswer;
        }
        System.out.println("Congratulations! You guessed " + goodAnswer + " colors from ten. You have extrasensory perception.");
    }
}
