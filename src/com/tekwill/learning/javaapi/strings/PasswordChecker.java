package com.tekwill.learning.javaapi.strings;

public class PasswordChecker {
    public boolean checkLength(String password) {

        if (password.length() >= 8) return true;
        else return false;
    }

    public boolean checkConsistence(String password) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        int passwordCharacters = 0;
        for (int i = 0; i < password.length(); i++) {
            for (char letter : letters) {
                if (password.charAt(i) == letter) {
                    ++passwordCharacters;
                }
            }
        }
        if (passwordCharacters == password.length()) return true;
        else return false;
    }

    public boolean checkDigits(String password) {

        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            for (char digit : digits) {
                if (password.charAt(i) == digit) {
                    ++numberOfDigits;
                }
            }

        }
        if (numberOfDigits >= 2) return true;
        else return false;
    }
}