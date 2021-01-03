package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class FatGramCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of calories and fat grams in a food item:");
        int calories = scanner.nextInt();
        int fatGrams = scanner.nextInt();
        int caloriesFromFat = fatGrams * 9;
        int percentageCalories = caloriesFromFat % calories;
        System.out.println("The percentage of the calories that come from fat is "+ percentageCalories);
        if (percentageCalories < 30) {
            System.out.println("The food is low in fat.");
        }
    }
}
