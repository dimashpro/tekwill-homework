package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class CreditCardNumberValidatorDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long cardNumber = scanner.nextLong();

        if (CreditCardNumberValidator.isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid.");
        } else {
            System.out.println(cardNumber + " is invalid.");
        }

    }
}
