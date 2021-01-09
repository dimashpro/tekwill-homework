package com.tekwill.learning.methods;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 numbers between 1 and 30 :");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberFour = scanner.nextInt();
        int numberFive = scanner.nextInt();
        displayAsterisk(numberOne);
        displayAsterisk(numberTwo);
        displayAsterisk(numberThree);
        displayAsterisk(numberFour);
        displayAsterisk(numberFive);
    }
    public static void displayAsterisk(int number){
      for (int i = 0; i < number; i++){
          System.out.print("*");
      }
        System.out.println();
    }
}
