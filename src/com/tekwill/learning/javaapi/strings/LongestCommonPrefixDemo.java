package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class LongestCommonPrefixDemo {
    public static void main(String[] args) {

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        prefix.compareStrings(firstString, secondString);

    }
}
