package com.tekwill.learning.javaapi.strings;

public class UppercaseLettersCounter {

    public static int countUppercaseLetters(String text) {

        char[] chArr = text.toCharArray();
        int uppercaseLetters = 0;

        for (int i = 0; i < chArr.length; i++) {
            if (Character.isUpperCase(chArr[i])) {
                uppercaseLetters++;
            }
        }
        return uppercaseLetters;
    }
}
