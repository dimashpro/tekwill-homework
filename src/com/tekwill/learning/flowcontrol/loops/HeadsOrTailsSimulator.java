package com.tekwill.learning.flowcontrol.loops;

import java.util.Random;

public class HeadsOrTailsSimulator {
    public static void main(String[] args) {
        int flippingTimes = 0;
        int headCoin = 0;
        int tailCoin = 0;
        Random random = new Random();

        do {
            int coinChecker = random.nextInt(2);
            if (coinChecker == 1) {
                headCoin++;
            } else {
                tailCoin++;
            }
            flippingTimes++;
        } while (flippingTimes < 1_000_000);

        System.out.println("Number of flipped heads on coins are " + headCoin);
        System.out.println("Number of flipped tails on coins are " + tailCoin);

    }
}
