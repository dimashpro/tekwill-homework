package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DollarAmount {
    public static void main(String[] args) {
        System.out.println("Enter a dollar amount:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int billsOf20 = amount / 20;
        int restAmountOf20 = amount % 20;
        int billsOf10 = restAmountOf20 / 10;
        int restAmountOf10 = restAmountOf20 % 10;
        int billsOf5 = restAmountOf10 / 5;
        int billsOf1 = restAmountOf10 % 5;
        System.out.println("$20 bills : "+ billsOf20);
        System.out.println("$10 bills : "+ billsOf10);
        System.out.println(" $5 bills : "+ billsOf5);
        System.out.println(" $1 bills : "+ billsOf1);




    }
}
