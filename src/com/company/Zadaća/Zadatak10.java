package com.company.Zadaća;

import java.util.ArrayList;

public class Zadatak10 {
    public static void main(String[]args){
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(2);
        a1.add(-5);
        a1.add(4);
        a1.add(12);
        a1.add(54);
        a1.add(-2);
        a1.add(-50);
        a1.add(150);

        ArrayList<Integer> positive=new ArrayList<Integer>();
        ArrayList<Integer> negative=new ArrayList<Integer>();

        for(int i=0; i<a1.size();i++){
            if (a1.get(i)<0){
                System.out.println("Negativni su:" + a1.get(i) + " ");
            } else if(a1.get(i)>0){
                System.out.println("Pozitivni su:" + a1.get(i) + " ");
            }
        }
    }
}
