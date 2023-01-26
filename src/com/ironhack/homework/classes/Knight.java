package com.ironhack.homework.classes;

import com.ironhack.homework.interfaces.Attacker;

public class Knight extends Character implements Attacker {
    private int energy;

    private int thrust;


    public Knight(String name) {
        super(name);
        int knightHp=(int)(Math.random()*(100-40+1)+40);
        int knightEnergy = (int)(Math.random()*(40-10+1)+10);
        int knightThrust = (int)(Math.random()*(30-10+1)+10);
        setThrust(knightThrust);
        setEnergy(knightEnergy);
        super.setHp(knightHp);
    }
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    @Override
    public String getInfo() {
        String info = "Character Info:";
        info += "\nName: " + getName();
        info += "\nType: Knight";
        info += "\nHP: " + getHp();
        info += "\nEnergy: " + getEnergy();
        info += "\nThrust: " + getThrust();
        info += "\n***************";
        return info;
    }
    @Override
    public void attack(Character enemy){
        double random = Math.random()*(2)+1;
        if(random > 1.5 && energy>=5){
            enemy.setHp(enemy.getHp()-thrust);
            energy -= 5;
        }else if(random < 1.5 || energy>0){
            enemy.setHp(enemy.getHp()-thrust/2);
            energy++;
        }else{
            energy+=2;
        }
    }

    @Override
    public void turn(Character enemy) {
        attack(enemy);
    }

}
