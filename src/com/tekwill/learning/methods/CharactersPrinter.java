package com.tekwill.learning.methods;

public class CharactersPrinter {
    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int numberOfCharacters = 0;

        for (char ch = ch1; ch <= ch2; ch++) {
            ++numberOfCharacters;
            System.out.print(ch + " ");
            if (numberOfCharacters % numberPerLine == 0) {
                System.out.println();
            }

        }
    }
}
