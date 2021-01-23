package com.tekwill.learning.javaapi.strings;

public class VowelsAndConsonantsCounter {

    public static int[] countVowelsAndConsonants(String text) {

        char[] strArray = text.toUpperCase().toCharArray();
        int counterVowels = 0, counterConsonants = 0;
        int[] result;
        result = new int[2];

        for (int i = 0; i < strArray.length; i++) {
            switch (strArray[i]) {
                case 'A':
                case 'O':
                case 'I':
                case 'U':
                case 'E':
                case 'Y':
                    result[0] = ++counterVowels;
                    break;
                case 'Q':
                case 'W':
                case 'R':
                case 'T':
                case 'P':
                case 'S':
                case 'D':
                case 'F':
                case 'G':
                case 'H':
                case 'J':
                case 'K':
                case 'L':
                case 'Z':
                case 'X':
                case 'C':
                case 'V':
                case 'B':
                case 'N':
                case 'M':
                    result[1] = ++counterConsonants;
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}
