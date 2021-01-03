package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean letterSelected = true;
        do {
            System.out.print("Enter a letter: ");
            String letter = scanner.nextLine();

            switch (letter.toUpperCase()) {
                case "A" :
                case "B" :
                case "C" :
                    System.out.println("The corresponding number for letter " +letter + " is 2");
                    break ;
                case "D" :
                case "E" :
                case "F" :
                    System.out.println("The corresponding number for letter " +letter + " is 3");
                    break ;
                case "G" :
                case "H" :
                case "I" :
                    System.out.println("The corresponding number for letter " +letter + " is 4");
                    break ;
                case "J" :
                case "K" :
                case "L" :
                    System.out.println("The corresponding number for letter " +letter + " is 5");
                    break ;
                case "M" :
                case "N" :
                case "O" :
                    System.out.println("The corresponding number for letter " +letter + " is 6");
                    break ;
                case "P" :
                case "Q" :
                case "R" :
                case "S" :
                    System.out.println("The corresponding number for letter " +letter + " is 7");
                    break ;
                case "T" :
                case "U" :
                case "V" :
                    System.out.println("The corresponding number for letter " +letter + " is 8");
                    break ;
                case "W" :
                case "X" :
                case "Y" :
                case "Z" :
                    System.out.println("The corresponding number for letter " +letter + " is 9");
                    break ;
                default:
                    letterSelected = false;
                    System.out.println(letter + " don't have a corresponding number.");
                    break;
            }


        } while (letterSelected);
    }
}
