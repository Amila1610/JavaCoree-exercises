package com.company.three;

public class Minimum2 {
    public static void main(String[] args){
        int c=10;
        int a=c++;
        System.out.println("a poslije a=c++ " + a);
        System.out.println("c poslije a=c++ "+ c);

        a=++c;
        System.out.println("a poslije a=++c "+a);
        System.out.println("c poslije a=++c " + c);

        int a1=5;
        int a2=a1++;//a2=a1;a1=a1+1;
        int a3=++a1;//a2=a2+1;a3=a2;
        System.out.println("a1 je" + a1 + ", a2 je" + a2 + ", a3 je" + a3);
    }
}
