package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class CharacterDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int asciiCode = scanner.nextInt();
        if (asciiCode >=0 && asciiCode <= 127){
            System.out.println("The character for ASCII code " + asciiCode + " is " + (char) asciiCode);
        }
        else {
            System.out.println("Sorry, the ASCII code for un character must be between 0 and 127");
        }

    }
}
