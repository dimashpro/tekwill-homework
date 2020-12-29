package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();
        double side = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("Tha area of the pentagon is %.2f", area);
    }
}