package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class IntegerFormatterDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number and width: ");
        int number = scanner.nextInt();
        int width = scanner.nextInt();

        System.out.println(IntegerFormatter.format(number, width));

    }
}
