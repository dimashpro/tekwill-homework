package com.tekwill.learning.methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and the range up:");
        int number = scanner.nextInt();
        int multiplicationRange = scanner.nextInt();
        for (int i = 1; i <= multiplicationRange; i++) {
            System.out.println(number + "X" + i + "=" + number * i);
        }
    }


}
