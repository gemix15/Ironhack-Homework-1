package com.ironhack.homework.classes;

import com.ironhack.homework.interfaces.Attacker;

public class Werewolf extends Character implements Attacker {
    private int endurance;

    private int bite;


    public Werewolf(String name) {
        super(name);
        int werewolfHp=(int)(Math.random()*(50-30+1)+30);
        int werewolfEndurance = (int)(Math.random()*(25-10+1)+10);
        int werewolfBite = (int)(Math.random()*(50-25+1)+25);
        setBite(werewolfBite);
        setEndurance(werewolfEndurance);
        super.setHp(werewolfHp);
    }
    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getBite() {
        return bite;
    }

    public void setBite(int bite) {
        this.bite = bite;
    }

    @Override
    public String getInfo() {
        String info = "Character Info:";
        info += "\nName: " + getName();
        info += "\nType: Werewolf";
        info += "\nHP: " + getHp();
        info += "\nEndurance: " + getEndurance();
        info += "\nBite: " + getBite();
        info += "\n***************";
        return info;
    }
    @Override
    public void attack(Character enemy){
        double random = Math.random()*(2)+1;
        if(random > 1.5 && endurance>=5){
            enemy.setHp(enemy.getHp()-bite);
            endurance -= 5;
        }else if(random < 1.5 || endurance>0){
            enemy.setHp(enemy.getHp()-bite/2);
            endurance++;
        }else{
            endurance+=2;
        }
    }

    @Override
    public void turn(Character enemy) {
        attack(enemy);
    }

}
