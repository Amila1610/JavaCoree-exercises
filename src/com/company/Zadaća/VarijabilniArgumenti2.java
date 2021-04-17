package com.company.Zadaća;

public class VarijabilniArgumenti2 {
    public static void main(String[]args){
        VarijabilniArgumenti a=new VarijabilniArgumenti();
        int s1=a.Zbir(2);
        System.out.println("Suma je "+ s1);
        int s2=a.Zbir(2,5,3);
        System.out.println("Suma je "+ s2);
        int s3=a.Zbir(2,5,3,100,120,77);
        System.out.println("Suma je "+ s3);
    }
}
