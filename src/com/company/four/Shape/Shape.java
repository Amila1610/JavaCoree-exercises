package com.company.four.Shape;
public class Shape {
    double x,y;
    String boja;
    String naziv;

    public Shape (String boja, String naziv, double x, double y){
        this.boja=boja;
        this.naziv=naziv;
        this.x=x;
        this.y=y;

    }
    public void Površina() {
        System.out.println("Površina ");
    }
}
