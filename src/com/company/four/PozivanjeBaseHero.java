package com.company.four;

public class PozivanjeBaseHero {
    public static void main(String[] args) {
        DrawfHero dh= new DrawfHero();
        dh.health=100;
        dh.mana=10;
        dh.dead= false;

        dh.receiveHit();
        dh.FirePrimary();
        dh.FireSecondary();
        dh.show();

        ElfMage em= new ElfMage(10, 12,false);
       // em.health=20;
        // em.mana=15;
        //em.dead= false;

        em.receiveHit();
        em.FirePrimary();
        em.FireSecondary();
        em.show();
    }
}
