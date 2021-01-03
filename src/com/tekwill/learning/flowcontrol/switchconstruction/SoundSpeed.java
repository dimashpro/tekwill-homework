package com.tekwill.learning.flowcontrol.switchconstruction;

import java.util.Scanner;

public class SoundSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the medium (air, water or steel)");
        String medium = scanner.nextLine();
        System.out.println("Enter the distance that the sound wave will travel:");
        double distance = scanner.nextDouble();
        switch (medium){
            case "air" :
                System.out.printf("Sound will travel in the %s %.3f seconds", medium, (distance / 1100));
                break;
            case "water" :
                System.out.printf("Sound will travel in the %s %.3f seconds", medium, (distance / 4900));
                break;
            case "steel" :
                System.out.printf("Sound will travel in the %s %.3f seconds", medium, (distance / 16400));
                break;
            default :
                System.out.println("You have entered a wrong medium");
                break;
        }
    }
}
