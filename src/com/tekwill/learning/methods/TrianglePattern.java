package com.tekwill.learning.methods;

public class TrianglePattern {
    public static void displayPattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= 1 ; j--) {
                if (i>=j) {
                    System.out.print(" " + j);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
