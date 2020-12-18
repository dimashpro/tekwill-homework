package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConvertHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in integer inches");
        int heightInInches = scanner.nextInt();
        int heightInFeet = heightInInches / 12;
        int restFromConvert = heightInInches % 12;
        System.out.println("height is " + heightInFeet + " feets " + restFromConvert + " inches");
    }
}
