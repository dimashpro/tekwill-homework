package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class TaxAmount {

    public static final double TAX = 5.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount in dollars and cents :");
        double amount = scanner.nextDouble();
        double addedTax = (amount * TAX) / 100;
        amount += addedTax;
        System.out.printf("Amount with tax added : $%.2f", amount);

    }
}
