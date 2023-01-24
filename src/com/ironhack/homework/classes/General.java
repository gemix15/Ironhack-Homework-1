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

    public String battleAttack(Character player1, Character player2) throws InterruptedException {
        do {
            player1.turn(player2);
            player2.turn(player1);
            System.out.println("Player 1: " + player1.getHp());
            System.out.println("Player 2 : " + player2.getHp());
            System.out.println("***************");
            Thread.sleep(1000);
        }
        while (player1.isAlive() && player2.isAlive());

        String winner = null;
        if (player1.isAlive()) winner = player1.getName();
        else if (player2.isAlive()) winner = player2.getName();
        System.out.println("The winner is : " + winner);
        return winner;
    }


}
