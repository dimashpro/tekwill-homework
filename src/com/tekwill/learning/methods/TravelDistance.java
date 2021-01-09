package com.tekwill.learning.methods;

import java.util.Scanner;

public class TravelDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle:");
        int speed = scanner.nextInt();
        System.out.println("How many hours has traveled the vehicle?");
        int time = scanner.nextInt();
        System.out.println("Hour   Distance Traveled");
        System.out.println("-------------------------");
        for (int i = 1; i <= time; i++) {
            System.out.printf("%2d%15d\n", i, (i * speed));
        }
    }
}
