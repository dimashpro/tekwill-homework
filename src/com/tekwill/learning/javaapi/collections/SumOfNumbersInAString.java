package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfNumbersInAString {
    public static void calculateSum(String numbersByCommas) {

        List<String> numbers = new ArrayList<>();
        int sumOfNumbers = 0;

        numbers.addAll(Arrays.asList(numbersByCommas.split(",")));
        for (String number : numbers) {
            sumOfNumbers += Integer.parseInt(number);
        }

        System.out.println("Sum of the numbers is " + sumOfNumbers);
    }
}
