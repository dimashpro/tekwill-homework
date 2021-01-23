package com.tekwill.learning.javaapi.strings;

public class ISBNChecker {
    public static void printISBN(String isbn) {

        char[] chArr = isbn.toCharArray();
        int checksum = 0;

        for (int i = 0; i < isbn.length(); i++) {
            int intNumber = Integer.parseInt(chArr[i] + "");
            if ((i + 1) % 2 == 0) {
                checksum += intNumber;
            } else {
                checksum += 3 * intNumber;
            }
        }
        checksum = 10 - checksum % 10;
        if (checksum == 10) {
            checksum = 0;

        }

        System.out.println("The ISBN-13 number is " + isbn + checksum);
    }
}
