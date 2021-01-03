package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class NumbersAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveValues = 0;
        int negativeValues = 0;
        int amountOfNumbers = 0;
        int number;
        double sum = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        number = scanner.nextInt();
        if(number != 0) {

            while (number != 0) {
                sum += number;
                amountOfNumbers++;

                if (number > 0) {
                    positiveValues++;
                } else {
                    negativeValues++;
                }
                number = scanner.nextInt();
            }

            System.out.println("The number of positives is " + positiveValues);
            System.out.println("The number of negatives is " + negativeValues);
            System.out.printf("The total is %.2f\n", sum);
            System.out.printf("The average is %.2f\n", (sum / amountOfNumbers));

        }
        else {
            System.out.println("No numbers are entered except 0.");
        }

    }
}
