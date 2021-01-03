package com.tekwill.learning.flowcontrol.loops;

public class KilogramsPoundsConverter {
    public static final double POUNDS_IN_A_KILOGRAM = 2.2;

    public static void main(String[] args) {
        System.out.print("Kilograms    Pounds   |   Pounds    Kilograms");
        for (int i = 1, j = 20; i < 200; i+=2, j+=5) {
            System.out.printf("\n%5d         %-5.1f   |%7d       %5.2f", i, (i * POUNDS_IN_A_KILOGRAM), j , (j / POUNDS_IN_A_KILOGRAM));
            
        }
    }
}
