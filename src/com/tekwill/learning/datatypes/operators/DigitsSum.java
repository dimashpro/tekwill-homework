package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number between 0 and 1000 :");
        int number = scanner.nextInt();
        int firstNumber = number  / 1000;
        int firstRest = number % 1000;
        int secondNumber = firstRest / 100;
        int secondRest = firstRest % 100;
        int thirdNumber = secondRest / 10;
        int fourthNumber = secondRest % 10;
        int sumOfDigits = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}
