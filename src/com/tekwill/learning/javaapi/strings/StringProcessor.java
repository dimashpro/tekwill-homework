package com.tekwill.learning.javaapi.strings;

public class StringProcessor {
    public void processString(String text) {
        String selectedCharacters = "";
        for (int i = 0; i < text.length(); i += 2) {
            selectedCharacters += text.charAt(i);
        }
        System.out.println(selectedCharacters);
    }
}
