package com.company.six;

public class CarMake {
    public static void main(String [] args) {
        String carMake = "Ford";
        int doors = 4;
        if (carMake.equals("Ford")) {
            switch (doors) {
                case 2:
                    System.out.println("Broj vrata je 2");
                    break;
                case 4:
                    System.out.println("Broj vrata je 4");
                    break;
            default:
                System.out.println("Auto nije Ford");

            }
        }
    }}