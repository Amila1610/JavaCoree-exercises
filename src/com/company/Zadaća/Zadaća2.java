package com.company.Zadaća;

public class Zadaća2 {
    public static void main(String []args){
        int[] array={2,-5,4,12,54,-2,-50,150};
        int[] negative= new int[8];
        int[] positive= new int[8];

        for(int i=0; i<array.length;i++){

         if (array[i]<0){
             negative[i]=array[i];
             System.out.println("Negativni niz je: " + negative[i]);
         } else if(array[i]>0){
             positive[i]=array[i];
             System.out.println("Pozitivni niz sadrži " + positive[i]);
         }
     }
    }
}
