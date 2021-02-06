package com.tekwill.learning.javaapi.collections;

import java.util.Scanner;

public class GradesAssignationDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the students: ");
        int numberOfStudents = scanner.nextInt();
        GradesAssignation.assignGrades(numberOfStudents);

    }
}
