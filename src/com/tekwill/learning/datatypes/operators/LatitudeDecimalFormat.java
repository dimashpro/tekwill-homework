package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LatitudeDecimalFormat {
    public static final double MINUTES_ARC = 60.0;
    public static final double SECONDS_ARC = 3600.0;
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter the latitude in degrees, minutes and seconds");
        System.out.println("First, enter the degrees");
        int degrees = scanner.nextInt();
        System.out.println("Next, enter the minutes of arc");
        int minutesOfArc = scanner.nextInt();
        System.out.println("Please, enter the seconds of the arc");
        int secondsOfArc = scanner.nextInt();

        double degreesInDecimal = degrees + (minutesOfArc / MINUTES_ARC) + (secondsOfArc / SECONDS_ARC);
        System.out.printf("Latitude is %.4f", degreesInDecimal);


        

    }
}
