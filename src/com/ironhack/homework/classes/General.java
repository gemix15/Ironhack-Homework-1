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
            System.out.println("Choose Warrior(1), Wizard(2), Knight(3), Werewolf(4) or Big boss(5):");
            characterType = scanner.nextInt();

        } while (characterType != 1 && characterType != 2 && characterType != 3 && characterType != 4 && characterType != 5);


        if (characterType == 1){
            character = new Warrior(name);
            System.out.println("You choose a Warrior");
        } else if (characterType  == 2){
            character = new Wizard(name);
            System.out.println("You choose a Wizard");
        } else if (characterType  == 3){
            character = new Knight(name);
            System.out.println("You choose a Knight");
        }else if (characterType  == 4){
            character = new Werewolf(name);
            System.out.println("You choose a Werewolf");
        }else if (characterType  == 5){
            character = new Bigboss(name);
            System.out.println("You choose the Big boss");
        }


        return character;
    }

    public String battleAttack(Character player1, Character player2) throws InterruptedException {
        System.out.println(art);
        Scanner neme = new Scanner(System.in);
        System.out.println("\n\t\tPRESS ENTER TO CONTINUE...");
        neme.nextLine();
        do {
            player1.turn(player2);
            player2.turn(player1);
            System.out.println(player1.getName() + " attack to " + player2.getName() );
            System.out.println(player2.getName()+": " + player2.getHp()+"♥");
            System.out.println("---");
            System.out.println(player2.getName() + " attack to " + player1.getName() );
            System.out.println(player1.getName()+": " + player1.getHp()+"♥");
            System.out.println("****************");
            Thread.sleep(600);
        }
        while (player1.isAlive() && player2.isAlive());

        String winner = null;
        if (player1.isAlive()) winner = player1.getName();
        else if (player2.isAlive()) winner = player2.getName();
        if(player1.isAlive()){
            System.out.println(art1);
        }else if (player2.isAlive()){
            System.out.println(art2);
        }
        System.out.println("The winner is : " + winner);
        return winner;
    }


}
