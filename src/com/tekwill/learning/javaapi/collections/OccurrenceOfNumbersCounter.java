package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccurrenceOfNumbersCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        boolean endInputs = false;

        System.out.println("Enter the integers between 0 and 100 ");
        while (!endInputs) {
            int number = scanner.nextInt();
            if (number != 0) {
                listOfNumbers.add(number);
            } else {
                endInputs = true;
            }
        }

        for (int i = 1; i <= 100; i++) {
            int timesOfOccurrence = 0;
            if (listOfNumbers.contains(i)) {
                for (Integer number : listOfNumbers) {
                    if (number.equals(i)) {
                        timesOfOccurrence++;
                    }
                }

                if (timesOfOccurrence > 1) {
                    System.out.println(i + " occurs " + timesOfOccurrence + " times");
                } else {
                    System.out.println(i + " occurs " + timesOfOccurrence + " time");
                }
            }
        }
    }
}
