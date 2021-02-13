package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class StringOperations {

    public static int wordCount(String text){
        String[] words = text.split(" ");
        return words.length;
    }

    public static String arrayToString(char[] charArray){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("In this sentence are " + wordCount(sentence) + " words");
    }
}
