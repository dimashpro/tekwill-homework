package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class CelsiusFahrenheitConvertor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius : ");
        double degreesCelsius = scanner.nextDouble();
        double degreesFahrenheit = (9.0 / 5) * degreesCelsius + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit.",degreesCelsius,degreesFahrenheit);
    }
}
