package com.company.Zadaća;

public class SumaPrvihSto {
    public static void main(String[]args){
        int sum=0;
        for (int i=0;i<=100;i++){
            sum+=i;
           /* for(int j=0;j<=100;j++){
                System.out.print(i+j + " ");
            }
            System.out.println();*/
        }
        System.out.println("Suma prvih 100 je: "+ sum);
    }
}
