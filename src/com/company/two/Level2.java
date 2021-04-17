package com.company.two;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int user= sc.nextInt();

        System.out.println("User level is " + user );
        System.out.println("Regular user level: " + (user==1));
        System.out.println("Admin user level: " + (user==2));
        System.out.println("Superadmin user level: " + (user==4));

    }
}
