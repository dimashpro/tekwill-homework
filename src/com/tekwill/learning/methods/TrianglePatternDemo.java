package com.tekwill.learning.methods;

import java.util.Scanner;

public class TrianglePatternDemo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        TrianglePattern.displayPattern(scanner.nextInt());
    }
}
