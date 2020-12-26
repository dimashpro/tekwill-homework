package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class FinanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate : ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();
        double gratuity = gratuityRate * subtotal / 100;
        double total = gratuity + subtotal;
        System.out.printf("The gratuity is $%.1f and total is $%.1f", gratuity, total);
    }
}
