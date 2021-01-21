package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class StringProcessorDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringProcessor processor = new StringProcessor();
        System.out.println("Enter a string:");
        processor.processString(scanner.nextLine());
    }


}
