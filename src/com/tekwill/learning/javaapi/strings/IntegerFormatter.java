package com.tekwill.learning.javaapi.strings;

public class IntegerFormatter {
    public static String format(int number, int width) {

        StringBuilder text = new StringBuilder(Integer.toString(number));
        int length = text.length();

        if (width > text.length()) {
            for (int i = 0; i < (width - length); i++) {
                text.insert(0, 0);
            }
        }
        return text.toString();
    }
}
