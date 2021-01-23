package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class UppercaseLettersCounterDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        System.out.print("The number of uppercase letters is : " + UppercaseLettersCounter.countUppercaseLetters(text));
    }
}
