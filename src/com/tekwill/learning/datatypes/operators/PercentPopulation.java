package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class PercentPopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current world\'s population : ");
        long currentWorldPopulation = scanner.nextLong();
        System.out.println("Enter the population of the Republic of Moldova : ");
        long countryPopulation = scanner.nextLong();
        double percentage = (countryPopulation * 100.0) /currentWorldPopulation;
        System.out.printf("The population of Republic of Moldova is %.5f percents of the world population. ", percentage);

    }
}
