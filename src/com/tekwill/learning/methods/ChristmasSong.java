package com.tekwill.learning.methods;

public class ChristmasSong {
    public static void main(String[] args){
        for (int i = 1; i <= 12; i++) {
            System.out.print("On the ");
            printDay(i);
            System.out.println(" day of Christmas\nMy true love sent to me:");
            for (int j = 12; j >= 1; j--) {
                if(j<=i){
                    printVerse(j);
                }
            }
        }

    }
    public static void printDay(int day){
        switch(day){
            case 1:
                System.out.print("first");
                break;
            case 2:
                System.out.print("second");
                break;
            case 3:
                System.out.print("third");
                break;
            case 4:
                System.out.print("fourth");
               break;
            case 5:
                System.out.print("fifth");
                break;
            case 6:
                System.out.print("sixth");
                break;
            case 7:
                System.out.print("seventh");
                break;
            case 8:
                System.out.print("eighth");
                break;
            case 9:
                System.out.print("ninth");
                break;
            case 10:
                System.out.print("tenth");
                break;
            case 11:
                System.out.print("eleventh");
                break;
            case 12:
                System.out.print("twelfth");
                break;
        }

    }
    public static void printVerse(int day){
        switch(day){
            case 1:
                System.out.println("A Partridge in a Pear Tree\n");
                break;
            case 2:
                System.out.println("2 Turtle Doves");
               break;
            case 3:
                System.out.println("3 French Hens");
                break;
            case 4:
                System.out.println("4 Calling Birds");
                break;
            case 5:
                System.out.println("5 Golden Rings");
                break;
            case 6:
                System.out.println("6 Geese a Laying");
                break;
            case 7:
                System.out.println("7 Swans a Swimming");
                break;
            case 8:
                System.out.println("8 Maids a Milking");
                break;
            case 9:
                System.out.println("9 Ladies Dancing");
                break;
            case 10:
                System.out.println("10 Lords a Leaping");
                break;
            case 11:
                System.out.println("11 Pipers Piping");
                break;
            case 12:
                System.out.println("12 Drummers Drumming");
                break;
        }

    }
}
