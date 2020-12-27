package com.tekwill.learning.datatypes.wrappers;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal value between 0 and 15");
        Integer value = scanner.nextInt();
        String hexValue = Integer.toHexString(value);

        if ((value >= 0) && (value <= 15)) {
            System.out.println("The hexadecimal value is " + hexValue);
        } else {
            System.out.println(value + " is an invalid input");
        }
    }
}
