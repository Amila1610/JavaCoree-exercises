package com.company.four;

public abstract class BaseHero {
    public double health, mana;
    public boolean dead;
    public void areaOfEffectHit (){
        receiveHit();
    }
    public abstract void receiveHit();
    public abstract void FirePrimary();
    public abstract void FireSecondary();

}
