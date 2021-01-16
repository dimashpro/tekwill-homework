package com.tekwill.learning.methods;

import java.util.Scanner;

public class RockPaperScissorsGameDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        boolean winner = false;
        System.out.println("Hello, welcome to the game. Enjoy it!");

        while (!winner) {
            System.out.print("Enter your choice 'rock', 'paper' or 'scissors' :");
            String userChoice = scanner.nextLine();
            String computerChoice = game.computerChoice();

            if (computerChoice.equals(game.userChoice(userChoice))) {
                System.out.println("You and computer make the same choice " + userChoice + " . Play one more time to determine the winner.");

            } else {
                game.selectWinner(computerChoice, userChoice);
                winner = true;
            }
        }
    }
}
