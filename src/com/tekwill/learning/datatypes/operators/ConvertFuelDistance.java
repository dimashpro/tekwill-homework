package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConvertFuelDistance {
    public static final double LITERS_IN_A_GALLON = 3.875;
    public static final double MILES_IN_ONE_HUNDRED_KILOMETERS_ = 62.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter automobile gasoline consumption in liters per 100 kilometers: ");
        double fuelConsumptionEU = scanner.nextDouble();
        double gallons = fuelConsumptionEU / LITERS_IN_A_GALLON;
        double fuelConsumptionUS = MILES_IN_ONE_HUNDRED_KILOMETERS_ / gallons;

        System.out.println("The automobile gasoline consumption is "+ fuelConsumptionUS + " mpg.");

    }
}
