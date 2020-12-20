package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class BodyMassIndex {
    public static final int INCHES_IN_ONE_FOOT = 12;
    public static final double INCHES_TO_METER = 0.0254;
    public static final double POUNDS_TO_KILO = 2.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in feet and inches:");
        System.out.println("Feet:");
        int feet = scanner.nextInt();
        System.out.println("Inches:");
        int inches = scanner.nextInt();
        System.out.println("Enter your weight in pounds :");
        int weightInPounds = scanner.nextInt();
        int heightInInches = feet * INCHES_IN_ONE_FOOT + inches;
        double heightInMeters = heightInInches * INCHES_TO_METER;
        double weightInKilo = weightInPounds / POUNDS_TO_KILO;
        double bodyMassIndex = weightInKilo / (heightInMeters * heightInMeters);
        System.out.printf("Your body mass index BMI is %.2f", bodyMassIndex);
    }
}
