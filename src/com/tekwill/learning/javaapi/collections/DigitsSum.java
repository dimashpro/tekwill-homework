package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;

public class DigitsSum {

    public static void calculateSumOfDigits(String text) {
        List<Integer> listOfDigits = new ArrayList<>();
        int highestDigit = Integer.MIN_VALUE;
        int lowestDigit = Integer.MAX_VALUE;
        int sumOfDigits = 0;

        for (int i = 0; i < text.length(); i++) {
            listOfDigits.add(Character.getNumericValue(text.charAt(i)));
        }

        for (Integer listOfDigit : listOfDigits) {
            sumOfDigits += listOfDigit;
        }
        for (Integer digit : listOfDigits) {
            if (digit > highestDigit) highestDigit = digit;
            if (digit < lowestDigit) lowestDigit = digit;
        }
        System.out.println("Sum of the digits is " + sumOfDigits);
        System.out.println("Highest digit is " + highestDigit);
        System.out.println("Lowest digit is " + lowestDigit);
    }
}
