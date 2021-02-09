package com.tekwill.learning.javaapi.collections;

import java.util.Scanner;

public class SumOfNumbersInAStringDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by comma :");
        SumOfNumbersInAString.calculateSum(scanner.nextLine());
    }
}
