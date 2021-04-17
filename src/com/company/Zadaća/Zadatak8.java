package com.company.Zadaća;

public class Zadatak8 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) System.out.print("a");
                if (j == 1) System.out.print("b");
                if (j == 2) System.out.print("c");
                if (j == 3) System.out.print("d");
                if (j == 4) System.out.print("e");
                if (j == 5) System.out.print("f");
                if (j == 6) System.out.print("g");
                if (j == 7) System.out.print("h");
                if (i == 0) System.out.print("8" + " ");
                if (i == 1) System.out.print("7" + " ");
                if (i == 2) System.out.print("6" + " ");
                if (i == 3) System.out.print("5" + " ");
                if (i == 4) System.out.print("4" + " ");
                if (i == 5) System.out.print("3" + " ");
                if (i == 6) System.out.print("2" + " ");
                if (i == 7) System.out.print("1" + " ");
            }
            System.out.println();
        }
    }
}