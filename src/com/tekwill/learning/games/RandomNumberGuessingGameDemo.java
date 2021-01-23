package com.tekwill.learning.games;

import java.util.Scanner;

public class RandomNumberGuessingGameDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play in Number Guessing Game!");
        System.out.println("Enter the maximal positive value in range that you want to play:");
        int maximalRange = scanner.nextInt();

        RandomNumberGuessingGame.guessNumber(maximalRange);
    }
}
