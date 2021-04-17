package com.company.four.Shape;

public class Kvadrat extends Shape {
    double a;

    public Kvadrat(String boja, String naziv, double x, double y,double a) {
        super(boja, naziv, x, y);
        this.a=a;
    }
    @Override
    public void Površina() {
        super.Površina();
        System.out.println(" kvadrata je P= " + (a*a));
    }
}
