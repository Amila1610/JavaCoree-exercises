package com.company.three;

public class IfElse {
    public static void main(String[] args){
        int x=6;
        int y=9;
        int z=3;

        if (x<y && x<z){
            System.out.println("Najmanji broj je x: " + x);
        } else {
            System.out.println("Najmanji broj nije x");
        }
        if (y<x && y<z){
            System.out.println("Najmanji broj je y: " + y);
        } else {
            System.out.println("Najmanji broj nije y");
        }
        if (z<x && z<y){
            System.out.println("Najmanji broj je z: " + z);
        } else {
            System.out.println("Najmanji broj nije z");
        }
    }
}
