package com.company.eight;

public abstract class GeoTijela {
    final static double PI = 3.14;
    double r;
    String name;


    public GeoTijela(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public abstract void Površina();

    public String toString() {
        return ("Površina" + this.name + " je");
    }

}

