package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class VowelsAndConsonantsCounterDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] counter = VowelsAndConsonantsCounter.countVowelsAndConsonants(str);
        System.out.println("The number of vowels is " + counter[0]);
        System.out.println("The number of consonants is " + counter[1]);

    }
}
