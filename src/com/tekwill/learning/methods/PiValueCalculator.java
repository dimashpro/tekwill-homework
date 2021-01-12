package com.tekwill.learning.methods;

public class PiValueCalculator {
    public static double pi(int terms){
        double result = 0;
        double sign = 1.0;
        boolean firstRoundedPi = true;

        for(int i = 1; i <= terms; i+=2)
        {
            result += 4 * sign / i;
            sign *= -1;
            if(Math.round((result * 100000)) == 314159 && firstRoundedPi) {
                System.out.println("We use " + (i /2 + 1) + " terms to get first value begin with 3,14159");
                firstRoundedPi = false;
            }

        }
        return result;
    }
}
