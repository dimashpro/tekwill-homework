package com.tekwill.learning.flowcontrol.switchconstruction;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number within the range of 1 through 10:");
        int decimalNumber = scanner.nextInt();
        switch (decimalNumber){
            case 1 :
                System.out.printf("Roman numeral of number %d is I.",decimalNumber);
                break;
            case 2 :
                System.out.printf("Roman numeral of number %d is II.",decimalNumber);
                break;
            case 3 :
                System.out.printf("Roman numeral of number %d is III.",decimalNumber);
                break;
            case 4 :
                System.out.printf("Roman numeral of number %d is IV.",decimalNumber);
                break;
            case 5 :
                System.out.printf("Roman numeral of number %d is V.",decimalNumber);
                break;
            case 6 :
                System.out.printf("Roman numeral of number %d is VI.",decimalNumber);
                break;
            case 7 :
                System.out.printf("Roman numeral of number %d is VII.",decimalNumber);
                break;
            case 8 :
                System.out.printf("Roman numeral of number %d is VIII.",decimalNumber);
                break;
            case 9 :
                System.out.printf("Roman numeral of number %d is IX.",decimalNumber);
                break;
            case 10 :
                System.out.printf("Roman numeral of number %d is X.",decimalNumber);
                break;
            default :
                System.out.println("You entered a wrong number");
                break;

        }
    }
}
