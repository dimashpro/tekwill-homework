package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class StringOperations {

    public static int wordCount(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public static String arrayToString(char[] charArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }

    public static char mostFrequent(String text) {
        char[] chars = text.toCharArray();
        int maximalOccurrence = 0;
        char mostFrequentCharacter = 0;

        for (int i = 0; i < chars.length; i++) {
            int occurrence = 0;

            char charValue = chars[i];

            for (int j = 0; j < chars.length; j++) {
                if ((chars[j] == charValue)&&(!Character.isWhitespace(charValue))) {
                    occurrence++;
                }
                if (occurrence > maximalOccurrence) {
                    maximalOccurrence = occurrence;
                    mostFrequentCharacter = charValue;
                }
            }

        }
        return mostFrequentCharacter;
    }

    public static String replaceSubstring(String string1, String string2, String string3) {
        String[] words = string1.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(string2)) {
                words[i] = string3;
            }
        }
        String newText = "";
        for (int i = 0; i < words.length; i++) {
            newText += (words[i] + " ");
        }
        return newText;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("In this sentence are " + wordCount(sentence) + " words");
        System.out.println("Most frequent character is " + mostFrequent(sentence));
        System.out.println("Array to String example " + arrayToString(sentence.toCharArray()));
        System.out.println(replaceSubstring("the dog jumped over the fence", "the", "that"));
    }
}
