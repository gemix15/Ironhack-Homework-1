package com.ironhack.homework.classes;

public class Wizard extends Character{
    private int mana;
    private int intelligence;


    public Character attack(Character character){
        Character updateCharacter=character;
        if(mana>=5){
            updateCharacter.setHp(character.getHp()-intelligence);
        }else if(mana>0){
            updateCharacter.setHp(character.getHp()-2);
            mana++;
        }else{
            mana++;
        }

        return updateCharacter;
    }
    public void setMana(){
        mana=(int)(Math.random()*(50-10+1)+10);
    }
    public void setIntelligence(){
        intelligence=(int)(Math.random()*(50)+1);
    }
    public void setHp(){
        int hp=(int)(Math.random()*(100-50+1)+50);;
        super.setHp(hp);
    }
    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
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
}
