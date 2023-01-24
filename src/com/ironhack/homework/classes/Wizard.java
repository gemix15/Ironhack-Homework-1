package com.ironhack.homework.classes;

import com.ironhack.homework.interfaces.Attacker;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;


    public Wizard(String name) {
        super(name);
        int wizardHp = (int)(Math.random()*(100-50+1)+50);
        int wizardItelligence = (int)(Math.random()*(50)+1);
        int wizardMana = (int)(Math.random()*(50-10+1)+10);
        super.setHp(wizardHp);
        setIntelligence(wizardItelligence);
        setMana(wizardMana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String getInfo() {
        String info = "Character Info:";
        info += "\n***************";
        info += "\nName: " + getName();
        info += "\nType: Wizard";
        info += "\nHP: " + getHp();
        info += "\nMana: " + getMana();
        info += "\nIntelligence: " + getIntelligence();
        info += "\n***************";
        return info;
    }

    @Override
    public void attack(Character enemy){
        double random = Math.random()*(2)+1;
        if(random > 1.5 && mana>=5){
            enemy.setHp(enemy.getHp()-intelligence);
            mana -= 5;
        }else if(random < 1.5 || mana>0){
            enemy.setHp(enemy.getHp()-2);
            mana++;
        }else{
            mana+=2;
        }
    }

    @Override
    public void turn(Character enemy) {
        attack(enemy);
    }
}
