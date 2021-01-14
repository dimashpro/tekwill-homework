package com.tekwill.learning.methods;

public class FeetAndMetersConvertorDemo {
    public static void main(String[] args) {
        System.out.println("Feet    Meters   |   Meters    Feet");
        System.out.print("----------------------------------------");
        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("\n%2d      %-3.3f    |%7d     %5.3f", i, FeetAndMetersConvertor.footToMeter(i), j, FeetAndMetersConvertor.meterToFoot(j));

        }
    }
}
