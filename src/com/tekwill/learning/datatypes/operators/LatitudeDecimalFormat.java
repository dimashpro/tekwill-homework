package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LatitudeDecimalFormat {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter the latitude in degrees, minutes and seconds");
        System.out.println("First, enter the degrees");
        int degrees = scanner.nextInt();
        System.out.println("Next, enter the minutes of arc");
        int minutesOfArc = scanner.nextInt();
        System.out.println("Please, enter the seconds of the arc");
        int secondsOfArc = scanner.nextInt();
        double minutesInDecimal = degrees * 100 / 60;
        double secondsInDecimal = secondsOfArc * 100 / 60;
        double degreesInDecimal = degrees + minutesInDecimal * 0.01 + secondsInDecimal * 0.0001;
        System.out.println("Latitude is " + degreesInDecimal);


        

    }
}
