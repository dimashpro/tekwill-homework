package com.tekwill.learning.methods;

public class MenuPrecursor {
    public static void showSentence(String letter){
        switch(letter.toLowerCase()){
            case "c":
                System.out.println("The crocodile is a carnivore.");
                break;
            case "p":
                System.out.println("Frederic Chopin is a famous pianist.");
                break;
            case "t":
                System.out.println("A maple is a tree.");
                break;
            case "g":
                System.out.println("Trivia is the best game.");
                break;

        }
    }
}
