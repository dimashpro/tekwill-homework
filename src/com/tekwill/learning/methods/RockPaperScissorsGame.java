package com.tekwill.learning.methods;

import java.util.Random;

public class RockPaperScissorsGame {

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";

    public static String computerChoice() {
        Random random = new Random();
        int randomChoice = 1 + random.nextInt(2);
        switch (randomChoice) {
            case 1:
                System.out.println("Computer choice is " + ROCK);
                return ROCK;
            case 2:
                System.out.println("Computer choice is " + PAPER);
                return PAPER;
            case 3:
                System.out.println("Computer choice is " + SCISSORS);
                return SCISSORS;
            default:
                return null;
        }
    }

    public static String userChoice(String choice) {
        boolean correctChoice = false;
        String selectedChoice = "";
        while (!correctChoice) {
            switch (choice) {
                case ROCK:
                    correctChoice = true;
                    selectedChoice = ROCK;
                    break;
                case PAPER:
                    correctChoice = true;
                    selectedChoice = PAPER;
                    break;
                case SCISSORS:
                    correctChoice = true;
                    selectedChoice = SCISSORS;
                    break;
                default:
                    System.out.println("Enter one more time your choice without errors :");
                    break;
            }
        }
        return selectedChoice;
    }

    public static void selectWinner(String computerAnswer, String userAnswer) {
        if (computerAnswer.equals(ROCK) && userAnswer.equals(SCISSORS)) {
            System.out.println("The computer won. The rock smashes the scissors.");
        } else if (computerAnswer.equals(SCISSORS) && userAnswer.equals(PAPER)) {
            System.out.println("The computer won. Scissors cuts paper.");
        } else if (computerAnswer.equals(PAPER) && userAnswer.equals(ROCK)) {
            System.out.println("The computer won. Paper wraps rock.");
        } else if (userAnswer.equals(ROCK) && computerAnswer.equals(SCISSORS)) {
            System.out.println("You won. The rock smashes the scissors.");
        } else if (userAnswer.equals(SCISSORS) && computerAnswer.equals(PAPER)) {
            System.out.println("You won. Scissors cuts paper.");
        } else {
            System.out.println("You won. Paper wraps rock.");
        }
    }
}
