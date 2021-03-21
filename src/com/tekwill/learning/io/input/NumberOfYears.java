package com.tekwill.learning.io.input;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is " + years
                + " years and " + days + " days");
    }
}
