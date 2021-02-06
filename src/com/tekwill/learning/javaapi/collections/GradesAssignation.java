package com.tekwill.learning.javaapi.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesAssignation {
    public static void assignGrades(int numberOfStudents){
        Map<Integer, Integer> studentsScores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
    //    int idStudent = 0;
        System.out.println("Enter " + numberOfStudents + " scores");
        for (int idStudent = 0; idStudent < numberOfStudents; idStudent++) {
            studentsScores.put(Integer.valueOf(idStudent), Integer.valueOf(scanner.nextInt()));
        }
        System.out.println(studentsScores);
     //   studentsScores.
        for (Integer value : studentsScores.values()) {
         //   System.out.println(value);
         //   System.out.println(studentsScores.values());
//int bestScore
        }

    }

}
