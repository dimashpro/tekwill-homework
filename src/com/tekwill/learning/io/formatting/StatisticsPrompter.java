package com.tekwill.learning.io.formatting;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the World population?");
        long currentWorldPopulation = scanner.nextLong();
        System.out.println("What is the rate of growing of World population per year?");
        double rateOfGrowing = scanner.nextDouble();
        System.out.println("Which are the sources for the World population counter?");
        scanner.nextLine();
        String source1 = scanner.nextLine();
        System.out.println("And the second source?");
        String source2 = scanner.nextLine();

        System.out.println("Current world population is "+currentWorldPopulation);
        System.out.println("The actual rate of growing population is "+rateOfGrowing+"% per year.");
        System.out.println("Sources for the world population counter:\n    *"+source1+"\n    *"+source2);

    }
}
