package com.company.five.Products;

public abstract class Product {
    String name;
    int barCode;
    double basicPrice;
    final static double tax= 0.2;
    double price;

        public Product(String name, int barCode, double basicPrice) {
            this.name=name;
            this.barCode= barCode;
            this.basicPrice=basicPrice;
    }

    public abstract double product();
}
