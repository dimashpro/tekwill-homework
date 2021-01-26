package com.tekwill.learning.methods;

public class PentagonalNumbers {

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }

    public static void main(String[] args) {
        int pentagonalNumbers = 100;
        for (int i = 1; i <= pentagonalNumbers; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
