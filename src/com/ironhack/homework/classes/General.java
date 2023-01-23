package com.ironhack.homework.classes;

import java.util.Scanner;

public class General {
    public Character createPlayer(String player){
        Character character = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre para el " + player + " :");
        String name = scanner.nextLine();
        int characterType;

        do {
            System.out.println("Elige Warrior(1) o Wizard(2):");
            characterType = scanner.nextInt();

        } while (characterType != 1 && characterType != 2);


        if (characterType == 1){
            character = new Warrior(name);
            System.out.println("You choose a Warrior");
        } else if (characterType  == 2){
            character = new Wizard(name);
            System.out.println("You choose a Wizard");
        }

        return character;
    }
}
