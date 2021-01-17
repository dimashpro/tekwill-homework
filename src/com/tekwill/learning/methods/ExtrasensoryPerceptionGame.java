package com.tekwill.learning.methods;

import java.util.Random;

public class ExtrasensoryPerceptionGame {
    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";
    public static final String ORANGE = "orange";
    public static final String YELLOW = "yellow";

    public static String computerChoice() {
        Random random = new Random();
        int randomChoice = random.nextInt(4);
        switch (randomChoice) {
            case 0:
                System.out.println("Computer choice is " + RED);
                return RED;
            case 1:
                System.out.println("Computer choice is " + GREEN);
                return GREEN;
            case 2:
                System.out.println("Computer choice is " + BLUE);
                return BLUE;
            case 3:
                System.out.println("Computer choice is " + ORANGE);
                return ORANGE;
            case 4:
                System.out.println("Computer choice is " + YELLOW);
                return YELLOW;
            default:
                return null;
        }
    }

    public static String userChoice(String choice) {
        boolean correctChoice = false;
        String selectedChoice = "";
        while (!correctChoice) {
            switch (choice) {
                case RED:
                    correctChoice = true;
                    selectedChoice = RED;
                    break;
                case GREEN:
                    correctChoice = true;
                    selectedChoice = GREEN;
                    break;
                case BLUE:
                    correctChoice = true;
                    selectedChoice = BLUE;
                    break;
                case ORANGE:
                    correctChoice = true;
                    selectedChoice = ORANGE;
                    break;
                case YELLOW:
                    correctChoice = true;
                    selectedChoice = YELLOW;
                    break;
                default:
                    correctChoice = true;
                    break;
            }
        }
        return selectedChoice;
    }


}
