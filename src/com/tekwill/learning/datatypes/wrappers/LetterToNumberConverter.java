package com.tekwill.learning.datatypes.wrappers;

import java.util.Scanner;

public class LetterToNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade :");
        String letterGrade = scanner.nextLine();
        if (letterGrade.equals("A")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 4");
        } else if (letterGrade.equals("B")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 3");
        }
        else if (letterGrade.equals("C")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 2");
        }
        else if (letterGrade.equals("D")){
            System.out.println("The numeric value for grade " + letterGrade + " is 1");
        }
        else if (letterGrade.equals("E")){
            System.out.println("The numeric value for grade " + letterGrade + " is 0");
        }
        else {
            System.out.println(letterGrade +" is an invalid grade");
        }
    }
}
