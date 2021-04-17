package com.company.two;

import java.util.Scanner;

public class EnteredVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("Entered variable is " + x);

            System.out.println("This variable even: " + (x%2==0));
    }

}
