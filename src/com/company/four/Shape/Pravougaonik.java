package com.company.four.Shape;

public class Pravougaonik extends Shape {
    double a,b;


    public Pravougaonik(String boja, String naziv, double x, double y, double a, double b) {
        super(boja, naziv, x, y);
        this.a=a;
        this.b=b;

    }
    @Override
    public void Površina() {
        super.Površina();
        System.out.println(" pravougaonika je P= " + (a*b));
    }
}
