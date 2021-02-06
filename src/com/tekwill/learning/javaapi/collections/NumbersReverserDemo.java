package com.tekwill.learning.javaapi.collections;

import java.util.Scanner;

public class NumbersReverserDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the integers that will be read :");
        int numberOfIntegers = scanner.nextInt();
        NumbersReverser.reverseNumbers(numberOfIntegers);

    }
}
