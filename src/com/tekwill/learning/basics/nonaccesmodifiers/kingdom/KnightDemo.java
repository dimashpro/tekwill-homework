package com.tekwill.learning.basics.nonaccesmodifiers.kingdom;

import static com.tekwill.learning.basics.nonaccesmodifiers.kingdom.Knight.guild;
import static com.tekwill.learning.basics.nonaccesmodifiers.kingdom.Knight.invokeMagic;

public class KnightDemo {
    public static void main(String[] args){
        Knight k1 = new Knight(34, "Arthur");
        Knight k2 = new Knight(31, "Richard");
        Knight k3 = new Knight(45,"Henrick");
        Knight k4 = new Knight(52,"Lancelot");

        guild = "Round Table";
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
        System.out.println(Knight.guild);
        //fight();    cannot call method fight without instance
        k1.fight();
        Knight.invokeMagic();
    }
}
