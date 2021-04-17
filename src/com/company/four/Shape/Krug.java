package com.company.four.Shape;

public class Krug extends Shape {
    double r;
    final static double PI=3.14;

    public Krug(String boja, String naziv, double x, double y,double r) {
        super(boja, naziv, x, y);
        this.r=r;

    }
    @Override
    public void Površina() {
        super.Površina();
        System.out.println("kruga je P= " + (r*r*PI));
    }
}
