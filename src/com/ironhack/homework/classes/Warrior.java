package com.ironhack.homework.classes;

import com.ironhack.homework.interfaces.Attacker;

public class Warrior extends Character implements Attacker {
    private int stamina;

    private int strength;

    @Override
    public void attack(Character character){
        Character updateCharacter=character;
        double random = Math.random()*(2)+1;
        if(random > 1.5 && stamina>=5){
            updateCharacter.setHp(character.getHp()-strength);
            stamina -= 5;
        }else if(random < 1.5 || stamina>0){
            updateCharacter.setHp(character.getHp()-strength/2);
            stamina++;
        }else{
            stamina+=2;
        }
    }


    public Warrior(String name) {
        super(name);
        int warriorHp=(int)(Math.random()*(200-100+1)+100);
        int warriorStamina = (int)(Math.random()*(50-10+1)+10);
        int warriorStrength = (int)(Math.random()*10+1);
        setStrength(warriorStrength);
        setStamina(warriorStamina);
        super.setHp(warriorHp);
    }
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String getInfo() {
        String info = "Character Info:";
        info += "\n***************";
        info += "\nName: " + getName();
        info += "\nType: Warrior";
        info += "\nHP: " + getHp();
        info += "\nStamina: " + getStamina();
        info += "\nStrength: " + getStrength();
        info += "\n***************";
        return info;
    }

}
