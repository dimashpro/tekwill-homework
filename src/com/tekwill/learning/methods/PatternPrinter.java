package com.tekwill.learning.methods;

public class PatternPrinter {
    public static void printBottomLeftAligned(int numberOfLines) {
        System.out.println("Pattern A");
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printTopLeftAligned(int numberOfLines) {
        System.out.println("Pattern B");
        for (int i = numberOfLines; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printBottomRightAligned(int numberOfLines) {
        System.out.println("Pattern C");
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= (numberOfLines - i); j++) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void printTopRightAligned(int numberOfLines) {
        System.out.println("Pattern D");

        for (int i = numberOfLines; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int k = numberOfLines; k >= i; k--) {
                System.out.print("  ");
            }

        }

    }
}
