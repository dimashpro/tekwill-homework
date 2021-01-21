package com.tekwill.learning.javaapi.strings;

public class LongestCommonPrefix {
    public void compareStrings(String firstString, String secondString) {

        String commonPrefix = "";
        int characterPosition = 0;

        if (firstString.charAt(characterPosition) != secondString.charAt(characterPosition)) {
            System.out.println(firstString + " and " + secondString + " have no common prefix.");
        } else {
            do {
                commonPrefix += firstString.charAt(characterPosition);
                characterPosition++;
            } while (firstString.charAt(characterPosition) == (secondString.charAt(characterPosition)));
            System.out.println("The common prefix is " + commonPrefix);
        }

    }
}
