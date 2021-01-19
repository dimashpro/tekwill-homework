package com.tekwill.learning.javaapi.arrays;

import java.util.Scanner;

public class Array79Demo {
    public static void main(String[] args) {

        //  a)  Write a statement that declare and create t
        int[][] t;
        t = new int[2][3];

        //  b)   How many rows does t have?
        int rows = t.length;

        //  c)  How many columns does t have?
        int columns = t[0].length;

        //  d)  How many elements does t have?
        int elements = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                elements++;
            }
        }
        System.out.println("Number of elements in array t is " + elements);

        //   e)  write access expressions for all the elements in row 1 of t
        for (int i = 0; i < t[1].length; i++) {
            System.out.print(t[1][i] + " ");
        }
        System.out.println();

        //   f)  write access expressions for all the elements in column 2 of t
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i][2]);
        }

        //  g ) write a single statement that sets the elements of t in row 0
        //  and column 1 to zero
        t[0][1] = 0;

        //  h)  write individual statement to initialize each element of t to zero
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        //  i)  write a nested for statement to initialize each element of t to zero
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }

        //  j)  write a nested for statement that inputs the values for the
        //  elements of t from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the elements of array t");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = scanner.nextInt();
            }
        }

        //  k) display the smallest value in t
        int minValue = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < minValue) {
                    minValue = t[i][j];
                }
            }
        }
        System.out.println("The smallest value in array t is " + minValue);

        // l) display with printf the elements of the first row of t

        System.out.println("Elements of the first row are");
        for (int i = 0; i < t[0].length; i++) {
            System.out.printf("%5d", t[0][i]);
        }
        System.out.println();

        //  m) total elements of the third column

        int total = 0;
        for (int i = 0; i < t.length; i++) {
            total += t[i][2];
        }

        // n )  the contents of t in tabular format

        for (int i = 0; i < t.length; i++) {
            System.out.println();
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
        }
    }
}
