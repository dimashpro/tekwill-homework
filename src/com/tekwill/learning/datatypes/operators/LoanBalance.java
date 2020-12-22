package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LoanBalance {
    public static void main(String[] args) {
        System.out.println("Enter amount of loan :");
        Scanner scanner = new Scanner(System.in);
        double amountOfLoan = scanner.nextDouble();
        System.out.println("Enter interest rate :");
        double interestRate = scanner.nextDouble();
        System.out.println("Enter monthly payment :");
        double monthlyPayment = scanner.nextDouble();
        double monthlyInterestRate = (interestRate / 100) / 12;
        double firstMonthBalance = amountOfLoan - monthlyPayment + amountOfLoan * monthlyInterestRate;
        double secondMonthBalance = firstMonthBalance - monthlyPayment + firstMonthBalance * monthlyInterestRate;
        double thirdMonthBalance = secondMonthBalance - monthlyPayment + secondMonthBalance * monthlyInterestRate;

        System.out.printf("Balance remaining after first payment: $%.2f\n", firstMonthBalance);
        System.out.printf("Balance remaining after second payment: $%.2f\n", secondMonthBalance);
        System.out.printf("Balance remaining after third payment: $%.2f\n", thirdMonthBalance);


    }
}
