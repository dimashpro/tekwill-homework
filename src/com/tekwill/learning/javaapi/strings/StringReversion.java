package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class StringReversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        System.out.println("The reversed string is " + reversedText);
    }
}
