package com.tekwill.learning.methods;

public class PiInfiniteMethodCalculator {
    public static void main(String[] args){
        double pi = 4;
        double  sign =-1.0;
        for ( int i=3; i<= 400000; i+=2){
            pi += 4 * sign / i;
            sign *= -1;

        }
        System.out.println("The value of pi " + pi);
    }
}
