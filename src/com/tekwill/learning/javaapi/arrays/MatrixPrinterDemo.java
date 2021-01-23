package com.tekwill.learning.javaapi.arrays;

import java.util.Scanner;

public class MatrixPrinterDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        MatrixPrinter.printMatrix(n);
    }
}
