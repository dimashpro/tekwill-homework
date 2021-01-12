package com.tekwill.learning.methods;

import java.util.Scanner;

public class MenuPrecursorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean letterSelected = true;
        System.out.println("Please enter one of the following choices: ");
        System.out.println("c)  carnivore");
        System.out.println("p)  pianist");
        System.out.println("t)  tree");
        System.out.println("g)  game");

        do {
            String letter = scanner.nextLine();
            if ((letter.toLowerCase().equals("c"))||(letter.toLowerCase().equals("p"))||(letter.toLowerCase().equals("t"))||(letter.toLowerCase().equals("g"))){
                MenuPrecursor.showSentence(letter);
                letterSelected = false;
            } else {
                System.out.println("Please enter c, p ,t or g   ");
            }

        } while (letterSelected);

    }
}
