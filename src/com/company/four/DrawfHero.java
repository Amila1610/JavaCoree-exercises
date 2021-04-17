package com.company.four;

public class DrawfHero extends BaseHero{
    @Override
    public void receiveHit() {
        this.health -=10;
        this.mana -=15;
        this.dead = this.health<=0;
    }
    @Override
    public void FirePrimary() {
        this.mana -= 5;
        System.out.println("Firing primary!!");
    }

    @Override
    public void FireSecondary() {
        this.mana-= 10;
        System.out.println("Firing secondary!!!");
    }
    public void show(){
        System.out.println( "Health: " + this.health + " Mana: " + this.mana + "Dead " + this.dead);
    }
}
