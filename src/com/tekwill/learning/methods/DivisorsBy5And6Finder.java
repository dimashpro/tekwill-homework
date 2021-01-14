package com.tekwill.learning.methods;

public class DivisorsBy5And6Finder {
    public static boolean divisibleBy5(int number){
        if (number%5 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean divisibleBy6(int number){
        if (number%6 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
