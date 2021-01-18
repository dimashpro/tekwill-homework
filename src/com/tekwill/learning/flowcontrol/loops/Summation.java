package com.tekwill.learning.flowcontrol.loops;

public class Summation {
    public static void main(String[] args) {
        double sumOfTerms = 0;
        for (int i = 1; i < 625; i++) {
            sumOfTerms += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.printf("Summation of expression is %.7f", sumOfTerms);
    }
}
