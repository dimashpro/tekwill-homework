package com.tekwill.learning.flowcontrol.loops;

public class MilesToKilometersConverter {
    public static final double KILOMETERS_IN_A_MILE = 1.609;
    public static void main(String[] args) {
        System.out.print("Miles   Kilometers");
        for (int mile = 1; mile <= 10; mile++) {
            System.out.printf("\n%3d       %.3f", mile, (mile * KILOMETERS_IN_A_MILE));

        }

    }
}
