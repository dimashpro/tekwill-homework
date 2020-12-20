package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class FuelReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kilometers you have driven ? ");
        int kilometers = scanner.nextInt();
        System.out.println("How many liters of petrol have you used? ");
        int liters = scanner.nextInt();
        double fuelConsumption = (liters * 100.0 )/ kilometers ;
        System.out.printf("The car use %.1f liters of petrol on 100 kilometers.", fuelConsumption);

    }
}
