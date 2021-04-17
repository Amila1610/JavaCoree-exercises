package com.company.six;

public class Vjezba2 {
    public static void main(String[] args){
        int x=523134;
        int y=325423;
        if(x%y==0){
            System.out.println("Ostatak ne postoji");
        }else if (x%y!=0){
            if(x%y>1000){
                System.out.println("Ostatak postoji i veći je od 1000");
            }else if (x%y<1000){
                System.out.println("Ostatak postoji i manji je od 1000");
            }
        }


    }
}
