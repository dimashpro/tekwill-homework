package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class ISBNCheckerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN13 as a string:");
        String isbnNumber = scanner.nextLine();

        if (isbnNumber.length() != 12) {
            System.out.println(isbnNumber + " is an invalid input");
        } else {
            ISBNChecker.printISBN(isbnNumber);
        }
    }
}
