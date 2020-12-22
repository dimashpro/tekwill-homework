package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class HeightConverter {
    public static final int INCHES_IN_ONE_FOOT = 12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in integer inches");
        int heightInInches = scanner.nextInt();
        int heightInFeet = heightInInches / INCHES_IN_ONE_FOOT;
        int restFromConvert = heightInInches % INCHES_IN_ONE_FOOT;
        System.out.println("height is " + heightInFeet + " feets " + restFromConvert + " inches");
    }
}
