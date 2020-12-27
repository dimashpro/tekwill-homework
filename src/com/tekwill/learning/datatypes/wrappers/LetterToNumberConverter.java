package com.tekwill.learning.datatypes.wrappers;

import java.util.Scanner;

public class LetterToNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade :");
        String letterGrade = scanner.nextLine();
        Integer numericValue;
        if (letterGrade.equals("A")) {
            numericValue = 4;
            System.out.println("The numeric value for grade " + letterGrade + " is " + numericValue);
        } else if (letterGrade.equals("B")) {
            numericValue = 3;
            System.out.println("The numeric value for grade " + letterGrade + " is " + numericValue);
        }
        else if (letterGrade.equals("C")) {
            numericValue = 2;
            System.out.println("The numeric value for grade " + letterGrade + " is " + numericValue);
        }
        else if (letterGrade.equals("D")){
            numericValue = 1;
            System.out.println("The numeric value for grade " + letterGrade + " is " + numericValue);
        }
        else if (letterGrade.equals("E")){
            numericValue = 0;
            System.out.println("The numeric value for grade " + letterGrade + " is " + numericValue);
        }
        else {
            System.out.println(letterGrade +" is an invalid grade");
        }
    }
}
