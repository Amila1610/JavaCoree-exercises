package com.company.five.Card;

public class Card {
    double balance;
    public Card(double b){
        this.balance=b;
    }

    public void charge(double racun){
        if (racun > balance){
            System.out.println("Nema dovoljno sredstava");
        }else{
            balance-=racun;
            System.out.println("Naplata je izvršena.");
        }
    }
}




