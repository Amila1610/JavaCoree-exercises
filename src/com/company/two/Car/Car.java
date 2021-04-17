package com.company.two.Car;

public class Car {
    String make;
    String model;
    int numDoors;
    static int wheels;
    public static void HowMenyWheels(){
        System.out.println(wheels);
    }
    public void printDetails (){
        System.out.println("Car make " + make);
        System.out.println("Car model " + model);
        System.out.println("Number of doors  " + numDoors);
    }
    public Car(){
        model="I5";
        make="BMW";
        numDoors =2;

    }
}
