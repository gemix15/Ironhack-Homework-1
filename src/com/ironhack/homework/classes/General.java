package com.ironhack.homework.classes;

import java.util.Scanner;

public class General {
    String art =
            "███████╗████████╗ █████╗ ██████╗ ████████╗    ██████╗  █████╗ ████████╗████████╗██╗     ███████╗\n" +
                    "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝    ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝\n" +
                    "███████╗   ██║   ███████║██████╔╝   ██║       ██████╔╝███████║   ██║      ██║   ██║     █████╗  \n" +
                    "╚════██║   ██║   ██╔══██║██╔══██╗   ██║       ██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝  \n" +
                    "███████║   ██║   ██║  ██║██║  ██║   ██║       ██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗\n" +
                    "╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝       ╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝\n" +
                    "                                                                                                ";

    String art1=
            "██████╗ ██╗      █████╗ ██╗   ██╗███████╗██████╗      ██╗    ██╗    ██╗██╗███╗   ██╗███████╗\n" +
                    "██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██╔════╝██╔══██╗    ███║    ██║    ██║██║████╗  ██║██╔════╝\n" +
                    "██████╔╝██║     ███████║ ╚████╔╝ █████╗  ██████╔╝    ╚██║    ██║ █╗ ██║██║██╔██╗ ██║███████╗\n" +
                    "██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██╔══╝  ██╔══██╗     ██║    ██║███╗██║██║██║╚██╗██║╚════██║\n" +
                    "██║     ███████╗██║  ██║   ██║   ███████╗██║  ██║     ██║    ╚███╔███╔╝██║██║ ╚████║███████║\n" +
                    "╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝     ╚═╝     ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚══════╝\n" +
                    "                                                                                            ";
    String art2=
            "██████╗ ██╗      █████╗ ██╗   ██╗███████╗██████╗     ██████╗     ██╗    ██╗██╗███╗   ██╗███████╗\n" +
                    "██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██╔════╝██╔══██╗    ╚════██╗    ██║    ██║██║████╗  ██║██╔════╝\n" +
                    "██████╔╝██║     ███████║ ╚████╔╝ █████╗  ██████╔╝     █████╔╝    ██║ █╗ ██║██║██╔██╗ ██║███████╗\n" +
                    "██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██╔══╝  ██╔══██╗    ██╔═══╝     ██║███╗██║██║██║╚██╗██║╚════██║\n" +
                    "██║     ███████╗██║  ██║   ██║   ███████╗██║  ██║    ███████╗    ╚███╔███╔╝██║██║ ╚████║███████║\n" +
                    "╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝    ╚══════╝     ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚══════╝\n" +
                    "                                                                                                ";
    public Character createPlayer(String player){
        Character character = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your name " + player + " :");
        String name = scanner.nextLine();
        int characterType;

        do {
            System.out.println("Choose Warrior(1) or Wizard(2):");
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
        System.out.println(art);
        Scanner neme = new Scanner(System.in);
        System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
        neme.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER
        do {
            player1.turn(player2);
            player2.turn(player1);
            System.out.println("Player 1: " + player1.getHp());
            System.out.println("Player 2 : " + player2.getHp());
            System.out.println("***************");
            Thread.sleep(300);
        }
        while (player1.isAlive() && player2.isAlive());

        String winner = null;
        if (player1.isAlive()) winner = player1.getName();
        else if (player2.isAlive()) winner = player2.getName();
        System.out.println("The winner is : " + winner);
        if(player1.isAlive()){
            System.out.println(art1);
        }else if (player2.isAlive()){
            System.out.println(art2);
        }
        return winner;
    }


}
