package com.tekwill.learning.datatypes;

public class Constants {
    final int A = 0;
    final int B = 1;
    final double ARCHIMEDE_CONSTANT_PI = 3.14159265358979323846264338327950288;
    double archimedesConstantPi = Math.PI;
    final double EULER_NUMBER_E = 2.71828182845904523536028747135266249;
    double eulersNumberE = Math.exp(1);
    final String IMAGINARY_UNIT_I = "i^2 = -1";  // imaginary unit i^2 = -1
    final double PYTHAGORA_CONSTANT = 1.414213562373095048801688724209;
    double pythagorasConstant = Math.sqrt(2);
    final double GOLDEN_RATIO =  1.61803398874989484820;
    double goldenRatioPsi = (1 + Math.sqrt(5))/2;

    public static void main(String[] args){
        Constants constants = new Constants();
        System.out.println("a = "+constants.A);
        System.out.println("b = "+constants.B);
        System.out.println("pi = "+constants.ARCHIMEDE_CONSTANT_PI);
        System.out.println("pi = "+constants.archimedesConstantPi);
        System.out.println("e = "+constants.EULER_NUMBER_E);
        System.out.println("e = "+constants.eulersNumberE);
        System.out.println("square root of 2 = "+constants.PYTHAGORA_CONSTANT);
        System.out.println("square root of 2 = "+constants.pythagorasConstant);
        System.out.println("golden ratio = "+constants.GOLDEN_RATIO);
        System.out.println("golden ratio = "+constants.goldenRatioPsi);
        System.out.println("Unit imaginary number is "+constants.IMAGINARY_UNIT_I);


    }
}
