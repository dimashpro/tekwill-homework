package com.tekwill.learning.javaapi.strings;

import java.util.Scanner;

public class WordSeparatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence in which all of the words are run together");
        String sentence = scanner.nextLine();
        WordSeparator.convertSentence(sentence);
    }
}
