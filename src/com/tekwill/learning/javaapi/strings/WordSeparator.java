package com.tekwill.learning.javaapi.strings;

import java.util.ArrayList;
import java.util.List;

public class WordSeparator {
    public static void convertSentence(String sentence) {
        List<String> newSentence = new ArrayList<>();
        int k = 0;
        for (int i = 1; i < sentence.length(); i++) {

            if (Character.isUpperCase(sentence.charAt(i)) || (Character.isWhitespace(sentence.charAt(i)))) {

                newSentence.add(sentence.substring(k, i).toLowerCase());
                k = i;

            }
        }
        for (String text : newSentence) {
            System.out.print(text + " ");
        }
    }
}
