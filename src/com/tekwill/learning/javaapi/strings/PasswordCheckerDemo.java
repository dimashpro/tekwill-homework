package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class PasswordCheckerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scanner.nextLine();
        PasswordChecker pass = new PasswordChecker();

        if (pass.checkLength(password) && pass.checkConsistence(password) && pass.checkDigits(password)) {
            System.out.println("Valid Password.");
        } else {
            System.out.println("Invalid Password.");
        }
    }
}
