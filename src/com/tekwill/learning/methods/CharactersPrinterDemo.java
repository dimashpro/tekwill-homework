package com.tekwill.learning.methods;

public class CharactersPrinterDemo {
    public static void main(String[] args) {

        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;

        System.out.println("Characters from 1 to Z  are:");
        CharactersPrinter.printChars(ch1, ch2, numberPerLine);
    }
}
