package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersReverser {

    public static void reverseNumbers(int numberOfIntegers) {
        List<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + numberOfIntegers + " numbers");
        for (int i = 0; i < numberOfIntegers; i++) {
            int enteredNumber = scanner.nextInt();
            numbersList.add(enteredNumber);
        }
        System.out.println("Your list is ");
        System.out.println(numbersList);

        System.out.println("This numbers in reversed order");
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            System.out.print(numbersList.get(i) + " ");
        }
    }
}
