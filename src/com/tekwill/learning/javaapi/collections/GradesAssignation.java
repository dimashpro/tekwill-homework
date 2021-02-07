package com.tekwill.learning.javaapi.collections;

import java.util.*;

public class GradesAssignation {

    public static void assignGrades(int numberOfStudents) {

        List<Integer> studentsScores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter score of student " + i);
            studentsScores.add(scanner.nextInt());
        }


        for (Integer studentScore : studentsScores) {
            if (studentScore > bestScore) {
                bestScore = studentScore;
            }
        }

        for (int i = 0; i < studentsScores.size(); i++) {
            if (studentsScores.get(i) >= bestScore - 10) {
                System.out.println("Student " + i + " score is " + studentsScores.get(i) + " and grade is A.");
            } else if (studentsScores.get(i) >= bestScore - 20) {
                System.out.println("Student " + i + " score is " + studentsScores.get(i) + " and grade is B.");
            } else if (studentsScores.get(i) >= bestScore - 30) {
                System.out.println("Student " + i + " score is " + studentsScores.get(i) + " and grade is C.");
            } else if (studentsScores.get(i) >= bestScore - 40) {
                System.out.println("Student " + i + " score is " + studentsScores.get(i) + " and grade is D.");
            } else {
                System.out.println("Student " + i + " score is " + studentsScores.get(i) + " and grade is F.");
            }

        }
    }

    //    public static void assignGrades(int numberOfStudents){
//        Map<Integer, Integer> studentsScores = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//    //    int idStudent = 0;
//        System.out.println("Enter " + numberOfStudents + " scores");
//        for (int idStudent = 0; idStudent < numberOfStudents; idStudent++) {
//            studentsScores.put(Integer.valueOf(idStudent), Integer.valueOf(scanner.nextInt()));
//        }
//        System.out.println(studentsScores);
//     //   studentsScores.
//        for (Integer value : studentsScores.values()) {
//         //   System.out.println(value);
//
////int bestScore;
//        }
//
//    }
}
