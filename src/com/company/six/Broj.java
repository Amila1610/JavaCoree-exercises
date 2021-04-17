package com.company.six;

import java.util.Random;
import java.util.Scanner;

public class Broj {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("Koji broj sam zamislio?");
            Random rand= new Random();
            int zamisljeniBroj= rand.nextInt(5);

            while(true){
                System.out.println("Uneseni broj je:");
                int uneseniBroj= sc.nextInt();
                if(zamisljeniBroj==uneseniBroj) {
                    System.out.println("Jeste!");
                    break;
                }else
                    System.out.println("Nije");

                }
            }
        }
}
