package com.tekwill.learning.javaapi.arrays;

public class MatrixPrinter {

    public static void printMatrix(int n) {
        int[][] matrix;
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) Math.round(Math.random());
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
