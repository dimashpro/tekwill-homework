package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class CircleDistance {
    public static final double AVERAGE_EARTH_RADIUS = 6371.01;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(scanner.nextDouble());
        double y1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(scanner.nextDouble());
        double y2 = Math.toRadians(scanner.nextDouble());

        double greatCircleDistance = Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2))) * AVERAGE_EARTH_RADIUS;
        System.out.println("The distance between the two points is " + greatCircleDistance + " kilometers.");

    }


}
