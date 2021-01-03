package com.tekwill.learning.flowcontrol.switchconstruction;

import java.util.Scanner;

public class DaysNumberInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input month number (1-12):");
        int dayOfTheMonth = scanner.nextInt();
        switch (dayOfTheMonth){
            case 1:
                System.out.println("January - 31 days");
                break;
            case 2:
                System.out.println("February - 28 days");
                break;
            case 3:
                System.out.println("March - 31 days");
                break;
            case 4:
                System.out.println("April - 30 days");
                break;
            case 5:
                System.out.println("May - 31 days");
                break;
            case 6:
                System.out.println("June - 30 days");
                break;
            case 7:
                System.out.println("July - 31 days");
                break;
            case 8:
                System.out.println("August - 31 days");
                break;
            case 9:
                System.out.println("September - 30 days");
                break;
            case 10:
                System.out.println("October - 31 days");
                break;
            case 11:
                System.out.println("November - 30 days");
                break;
            case 12:
                System.out.println("December - 31 days");
                break;
            default:
                System.out.println("You have entered a wrong number of month");
                break;
        }
    }


}
