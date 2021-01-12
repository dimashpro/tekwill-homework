package com.tekwill.learning.methods;


import java.util.Scanner;

public class HighestScoreFinder {

    public static int maximalScore = Integer.MIN_VALUE;
    public static String bestStudentName;

    public static void findBestStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student and his score:");
        String studentName = scanner.next();
        int studentScore = scanner.nextInt();
        if (studentScore > maximalScore) {
           bestStudentName = studentName;
          maximalScore = studentScore;
        }

    }
    public static void printBestStudent(){
        System.out.println("The student with the highest score is " + bestStudentName + " with " + maximalScore + " points.");
    }

    }
