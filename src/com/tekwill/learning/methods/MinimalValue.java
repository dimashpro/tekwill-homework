package com.tekwill.learning.methods;

import java.util.Scanner;

public class MinimalValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstly number of values and next all values:");
        int numberOfValues = scanner.nextInt();
        int minimalNumber = scanner.nextInt();
        for (int i = 1; i < numberOfValues; i++){
            int value = scanner.nextInt();
            if (value < minimalNumber){
                minimalNumber = value;
            }
        }
        System.out.println("The smallest number is " + minimalNumber);
    }
}
