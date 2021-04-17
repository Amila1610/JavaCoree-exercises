package com.company.Zadaća;

/*public class BeskonačnaPetlja {
    public static void main(String[] args) {
        int k = 0;
        while (k <= 10) {
            if (k == 5) break;
            System.out.print(++k + " ");
        }
    }
}*/
public class BeskonačnaPetlja {
    public static void main(String[] args) {
        int k = 0;
        while (k <= 10) {
            if (k++ == 5) continue;
            System.out.print( k + " ");
        }
    }
}

