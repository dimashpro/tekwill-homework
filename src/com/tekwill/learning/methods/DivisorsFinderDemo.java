package com.tekwill.learning.methods;

public class DivisorsFinderDemo {
    public static void main(String[] args) {
        int k = 0, m = 0;
        System.out.println("Numbers from 100 to 1000, that are divisible by 5 AND 6 are:");
        for (int i = 100; i <= 1000; i++) {
            if (DivisorsFinder.divisibleBy5(i) && DivisorsFinder.divisibleBy6(i)) {
                System.out.print(i + " ");
                k++;
                if (k % 10 == 0) System.out.println();
            }
        }

        System.out.println("\nNumbers from 100 to 200, that are divisible by 5 OR 6 are:");
        for (int i = 100; i <= 200; i++) {
            if (DivisorsFinder.divisibleBy5(i) || DivisorsFinder.divisibleBy6(i)) {
                System.out.print(i + " ");
                m++;
                if (m % 10 == 0) System.out.println();
            }
        }
    }
}
