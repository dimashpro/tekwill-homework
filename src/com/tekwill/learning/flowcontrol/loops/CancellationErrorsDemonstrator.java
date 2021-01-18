package com.tekwill.learning.flowcontrol.loops;

public class CancellationErrorsDemonstrator {
    public static void main(String[] args) {
        int n = 50000;
        CancellationErrorsDemonstrator demonstrator = new CancellationErrorsDemonstrator();
        double leftToRightSummation = demonstrator.calculateLeftToRight(n);
        double rightToLeftSummation = demonstrator.calculateRightToLeft(n);

        System.out.printf("By calculating from left to right, the summation of the series is %.16f", leftToRightSummation);
        System.out.printf("\nBy calculating from right to left, the summation of the series is %.16f", rightToLeftSummation);
        System.out.printf("\nThe sum calculated in order from right to left is more accurate with  %.16f", (rightToLeftSummation - leftToRightSummation));

    }

    public double calculateLeftToRight(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / i;
        }
        return result;
    }

    public double calculateRightToLeft(int n) {
        double result = 0;
        for (int i = n; i >= 1; i--) {
            result += 1.0 / i;
        }
        return result;
    }
}
