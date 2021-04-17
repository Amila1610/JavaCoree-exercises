package com.company.Zadaća;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner broj = new Scanner(System.in);
        int brojRedovaIKolona = broj.nextInt();

        for (int i = 0; i < brojRedovaIKolona; i++) {
            for (int j = 0; j < brojRedovaIKolona; j++) {
                if (i == j) {
                    System.out.print("1" + " ");
                }
                if (i > j) {
                    System.out.print("d" + " ");
                }
                if (i < j) {
                    System.out.print("g" + " ");
                }
            }
            System.out.println();

        }
    }
}
