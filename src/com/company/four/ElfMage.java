package com.company.four;

public class ElfMage extends BaseHero {
    @Override
    public void receiveHit() {
        this.health-=30;
        this.dead=this.health<=0;
    }

    @Override
    public void FirePrimary() {
        this.mana-=15;
    }
    @Override
    public void FireSecondary() {
        this.mana-=50;
    }
    public void show(){
        System.out.println("Health: " + this.health + " Mana: " + this.mana + "Dead " + this.dead);
    }

    public ElfMage(int health,int mana, boolean dead){
        this.health=health;
        this.mana=mana;
        this.dead=dead;
    }
}
