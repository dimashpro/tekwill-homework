package com.tekwill.learning.methods;

public class DivisorsBy5And6FinderDemo {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 100; i <= 1000 ; i++) {
            if(DivisorsBy5And6Finder.divisibleBy5(i) && DivisorsBy5And6Finder.divisibleBy6(i)){
                System.out.print(i + " ");
                k++;
                if (k%10 == 0) System.out.println();
            }

        }
    }
}
