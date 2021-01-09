package com.tekwill.learning.methods;

import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate his factorial :");
        factorial(scanner.nextInt());
    }
    public static void factorial(int number){

        long factorialNumber =1;
        System.out.print("i      factorial");
        for (int i = 1; i <= number; i++) {
           factorialNumber *= i;
           System.out.printf("\n%d       %d", i, factorialNumber);
        }
    }
}
