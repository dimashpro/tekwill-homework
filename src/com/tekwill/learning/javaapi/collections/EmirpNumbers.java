package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;

public class EmirpNumbers {
    public static void printEmirps() {

        List<Integer> emirpNumbers = new ArrayList<>();
        int numberOfEmirps = 0;
        int incNumber = 0, counter = 0;

        while (numberOfEmirps < 100) {
            incNumber++;
            int n = incNumber;
            int emirpNumber = 0;
            while (n != 0) {
                emirpNumber = emirpNumber * 10 + n % 10;
                n /= 10;
            }

            if (incNumber != emirpNumber) {
                if (checkPrime(incNumber) && checkPrime(emirpNumber)) {
                    emirpNumbers.add(incNumber);
                    numberOfEmirps++;
                }
            }
        }
        for (Integer emirpNumber : emirpNumbers) {
            counter++;
            System.out.print(emirpNumber + " ");
            if ((counter % 10) == 0) System.out.println();
        }

    }

    public static boolean checkPrime(int checkedNumber) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= checkedNumber; i++) {
            if ((checkedNumber % i) == 0) {
                numberOfDivisors++;
            }
        }
        if (numberOfDivisors == 2) {
            return true;
        } else {
            return false;
        }
    }
}
