package com.company.eight;

public class Kupa extends GeoTijela {
    double s;

    Kupa(double r, String name) {
        super(r, name);
    }

    @Override
    public void Površina() {
        System.out.println("Površina kupe je:" + ((r * r * PI) + (r * s * PI)));

    }

}
