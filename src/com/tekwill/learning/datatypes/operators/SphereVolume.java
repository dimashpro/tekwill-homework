package com.tekwill.learning.datatypes.operators;

public class SphereVolume {
    public static void main(String[] args) {
        int radius = 10;
        double volume1 = 4 / 3 * Math.PI * Math.pow(radius, 3); // wrong 4/3=1
        double volume2 = 4.0f / 3.0f * Math.PI * Math.pow( radius, 3);  // correct 4/3 = 1.33333

        System.out.println("The volume of the sphere with 10-meter radius is "+ volume2);
        System.out.println("Miscalculation "+volume1);

    }
}
