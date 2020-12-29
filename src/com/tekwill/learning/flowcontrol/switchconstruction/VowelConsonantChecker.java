package com.tekwill.learning.flowcontrol.switchconstruction;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();

        switch (letter.toUpperCase()) {
            case "A" :
            case "O" :
            case "I" :
            case "U" :
            case "E" :
            case "Y" :
                System.out.println(letter + " is a vowel");
                break ;
            case "Q" :
            case "W" :
            case "R" :
            case "T" :
            case "P" :
            case "S" :
            case "D" :
            case "F" :
            case "G" :
            case "H" :
            case "J" :
            case "K" :
            case "L" :
            case "Z" :
            case "X" :
            case "C" :
            case "V" :
            case "B" :
            case "N" :
            case "M" :
                System.out.println(letter + " is a consonant");
                break;
            default:
                System.out.println(letter + " is an invalid input");
                break;
        }
    }
}
