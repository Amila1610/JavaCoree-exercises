package com.company.five.Products;

public class MainProduct {
    public static void main(String[]args){
        Chocolate c=new Chocolate("Milka", 22569847,6.8, 350);
        c.product();
        c.pprice();
        Wine w= new Wine("Rose", 21645973, 26.40, 1.5);
        w.product();
        w.cijena();
    }
}
