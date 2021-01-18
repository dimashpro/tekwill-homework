package com.tekwill.learning.javaapi.arrays;

import java.util.Random;

public class Array78Demo {
    public static void main(String[] args) {

        //  a) display the value of element 6 of array f;

        String[] f;
        f = new String[10];
        System.out.println("The value of element 6 is " + f[5]);

        //  b)

        int[] g;
        g = new int[5];
        for (int i = 0; i < g.length; i++) {
            g[i] = 8;
        }

        //c

        double[] c;
        double total = 0;
        c = new double[100];
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }

        //d

        int[] a;
        int[] b;
        a = new int[11];
        b = new int[34];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        //   e)


        double[] w;
        w = new double[99];

        Random random = new Random();
        for (int i = 0; i < w.length; i++) {
            w[i] = random.nextDouble();
        }

        double minValue = w[0];
        double maxValue = w[0];
        for (int i = 0; i < w.length; i++) {
            if (w[i] < minValue) {
                minValue = w[i];
            }
            if (w[i] > maxValue) {
                maxValue = w[i];
            }
        }
        System.out.println("The smallest value in array w is " + minValue);
        System.out.println("The largest value in array w is " + maxValue);

    }
}
