package com.ironhack.homework.classes;

public class Warrior extends Character {
    private int stamina;

    private int strength;

    public Character attack(Character character){
        Character updateCharacter=character;
        if(stamina>=5){
            updateCharacter.setHp(character.getHp()-strength);
        }else if(stamina>0){
            updateCharacter.setHp(character.getHp()-strength/2);
            stamina++;
        }else{
            stamina+=2;
        }
        return updateCharacter;
    }
    public void setStamina(){
        stamina=(int)(Math.random()*(50-10+1)+10);
    }
    public void setStrength(){
        strength=(int)(Math.random()*10+1);
    }

    public void setHp(){
        int hp=(int)(Math.random()*(200-100+1)+100);
        super.setHp(hp);
    }
    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
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

}
