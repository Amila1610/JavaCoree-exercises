package com.company.four.Shape;

public class ShapeRezultat {
    public static void main(String[] args){
        Shape s= new Shape ("Zelena","Trougao",2.6,1.3);
        s.Površina();
        Pravougaonik p= new Pravougaonik("Narandžasta", "Pravougaonik", 1.0,2.5,1.4,2.7);
        p.Površina();
        Kvadrat k= new Kvadrat("Ljubičasta","Kvadrat",3.5,4.1,2.2);
        k.Površina();
        Krug kr=new Krug("Žuta", "Krug", 1.2,1.1,2.2);
        kr.Površina();
    }
}
