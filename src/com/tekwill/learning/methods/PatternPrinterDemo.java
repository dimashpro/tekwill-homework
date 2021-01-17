package com.tekwill.learning.methods;

import java.util.Scanner;

public class PatternPrinterDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines in patterns ");
        int numberOfLines = scanner.nextInt();
        PatternPrinter.printBottomLeftAligned(numberOfLines);
        PatternPrinter.printTopLeftAligned(numberOfLines);
        PatternPrinter.printBottomRightAligned(numberOfLines);
        PatternPrinter.printTopRightAligned(numberOfLines);

    }
}
