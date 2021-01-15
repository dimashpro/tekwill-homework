package com.tekwill.learning.methods;

import java.util.Scanner;

public class TrianglePatternDemo {
    public static void main(String[] args) {
        TrianglePattern pattern = new TrianglePattern();
        System.out.println("Enter three numbers :");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            pattern.displayPattern(scanner.nextInt());
        }

    }
}
