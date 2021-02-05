package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersReverser {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int enteredNumber = scanner.nextInt();
            numbersList.add(enteredNumber);
        }
        System.out.println(numbersList);

        for (int i = numbersList.size()-1; i >= 0 ; i--) {
            System.out.print(numbersList.get(i) + " ");
        }
    }
}
