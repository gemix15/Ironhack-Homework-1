package com.ironhack.homework.main;

import com.ironhack.homework.classes.Character;
import com.ironhack.homework.classes.General;
import com.ironhack.homework.classes.Warrior;
import com.ironhack.homework.classes.Wizard;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//    crear un player 1
        General player1 = new General();
        Character character1 = player1.createPlayer("Player 1");


//        crear un player 2
        General player2 = new General();
        Character character2 = player2.createPlayer("Player 2");

//        Mostrar stats por pantalla
        System.out.println(character1.getInfo());
        System.out.println(character2.getInfo());

//        batalla
        General battle = new General();
        battle.battleAttack(character1, character2);
    }
}
