package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static int positiveNumbers = 0, negativeNumbers = 0, zeroNumbers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double number4 = scanner.nextDouble();
        double number5 = scanner.nextDouble();
        checkNumber(number1);
        checkNumber(number2);
        checkNumber(number3);
        checkNumber(number4);
        checkNumber(number5);

        System.out.println("Number of positive numbers is " + positiveNumbers);
        System.out.println("Number of zero numbers is " + zeroNumbers);
        System.out.println("Number of negative numbers is " + negativeNumbers);


    }

        public static void checkNumber ( double number){
            if (number > 0) {
                positiveNumbers++;
            } else if (number == 0) {
                zeroNumbers++;
            } else {
                negativeNumbers++;
            }
        }


}
