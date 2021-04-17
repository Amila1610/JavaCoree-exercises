package com.company.Zadaća;

import java.util.Random;

public class Kombinacije {
    public static void main(String[] args){
        Random r= new Random();
        String[] imena={ "Heart", "Cherry","Coin","Melon","Jocker" };
        System.out.println("Kombinacija je: " +
                imena[ r.nextInt(5)]+" "+ imena[ r.nextInt(5)]+" " +imena[ r.nextInt(5)]
                +" "+imena[ r.nextInt(5)]+" "+ imena[ r.nextInt(5)]);

    }
}
