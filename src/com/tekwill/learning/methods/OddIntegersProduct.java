package com.tekwill.learning.methods;

public class OddIntegersProduct {
    public static void main(String[] args) {
        int total = 1;
        for (int i = 1; i <= 15; i++){
            if (i % 2 == 0 ){
                continue;
            }
            total = total * i;
        }
        System.out.println("Product of the odd integers from 1 to 15 is " + total);
    }
}
