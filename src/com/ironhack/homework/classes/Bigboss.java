package com.ironhack.homework.classes;

import com.ironhack.homework.interfaces.Attacker;

public class Bigboss extends Character implements Attacker {
    private int resistance;

    private int punch;


    public Bigboss(String name) {
        super(name);
        int bigbossHp=(int)(Math.random()*(400-250+1)+250);
        int bigbossResistance = (int)(Math.random()*(30-10+1)+10);
        int bigbossPunch = (int)(Math.random()*(10)+1);
        setPunch(bigbossPunch);
        setResistance(bigbossResistance);
        super.setHp(bigbossHp);
    }
    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getPunch() {
        return punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }

    @Override
    public String getInfo() {
        String info = "Character Info:";
        info += "\nName: " + getName();
        info += "\nType: Knight";
        info += "\nHP: " + getHp();
        info += "\nResistance: " + getResistance();
        info += "\nPunch: " + getPunch();
        info += "\n***************";
        return info;
    }
    @Override
    public void attack(Character enemy){
        double random = Math.random()*(2)+1;
        if(random > 1.5 && resistance>=5){
            enemy.setHp(enemy.getHp()-punch);
            resistance -= 5;
        }else if(random < 1.5 || resistance>0){
            enemy.setHp(enemy.getHp()-punch/2);
            resistance++;
        }else{
            resistance+=2;
        }
    }

    @Override
    public void turn(Character enemy) {
        attack(enemy);
    }

}
