package com.tekwill.learning.datatypes;

public class Constants {
    int a;
    int b = 1;
    double archimedesConstantPi1 = 3.141592653;
    double archimedesConstantPi2 = Math.PI;
    double eulersNumberE1 = 2.7182818284;
    double eulersNumberE2 = Math.exp(1);
    double i;  // imaginary unit i^2 = -1
    double pythagorasConstant1 = 1.4142135623;
    double pythagorasConstant2 = Math.sqrt(2);
    double goldenRatioPsi1 = 1.6180339887;
    double goldenRatioPsi2 = (1 + Math.sqrt(5))/2;

    public static void main(String[] args){
        Constants constants = new Constants();
        System.out.println("a = "+constants.a);
        System.out.println("b = "+constants.b);
        System.out.println("pi = "+constants.archimedesConstantPi1);
        System.out.println("pi = "+constants.archimedesConstantPi2);
        System.out.println("e = "+constants.eulersNumberE1);
        System.out.println("e = "+constants.eulersNumberE2);
        System.out.println("square root of 2 = "+constants.pythagorasConstant1);
        System.out.println("square root of 2 = "+constants.pythagorasConstant2);
        System.out.println("golden ratio = "+constants.goldenRatioPsi1);
        System.out.println("golden ratio = "+constants.goldenRatioPsi2);


    }
}
