package com.company.three;

import java.util.Scanner;

public class GodišnjeDoba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int broj = sc.nextInt();

        if (broj == 1) {
            System.out.println("Trenutno godišnje doba je Proljeće");
        }
        if (broj == 2) {
            System.out.println("Trenutno godišnje doba je Ljeto");
        }
        if (broj == 3) {
            System.out.println("Trenutno godišnje doba je Jesen");
        }
        if (broj == 4) {
            System.out.println("Trenutno godišnje doba je Zima");
        } else {
            if ((broj != 1) && (broj != 2) && (broj != 3) && (broj != 4)) {
                System.out.println("Godišnje doba ne postoji!!");
            }
        }
    }
}
