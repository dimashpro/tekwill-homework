package com.tekwill.learning.javaapi.strings;

public class ISBNChecker {
    public static void printISBN(String isbn) {

        char[] chArr = isbn.toCharArray();
        int checksum = 10 - (chArr[0] + 3 * chArr[1] + chArr[2] + 3 * chArr[3] + chArr[4] + 3 * chArr[5] +
                chArr[6] + 3 * chArr[7] + chArr[8] + 3 * chArr[9] + chArr[10] + 3 * chArr[11]) % 10;
        if (checksum == 10) {
            checksum = 0;
        }

        System.out.println("The ISBN-13 number is " + isbn + checksum);
    }
}
