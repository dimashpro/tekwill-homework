package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder : ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %.4f ", area);
        System.out.printf("\nThe volume is %.2f ", volume);
    }
}
