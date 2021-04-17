package com.company.five.Products;

public class Chocolate extends Product {
   double weight;

    @Override
    public double product() {
        price= basicPrice + (basicPrice *tax);
        return price;
    }
    public Chocolate ( String name, int barCode, double basicPrice, double weight ){
        super(name,barCode,basicPrice);
        this.weight=weight;
    }
    public void pprice(){
        System.out.println("The product named: " + this.name + ", bar-code: " + this.barCode + ", basic price: "
                + this.basicPrice  + ", price with tax 20%: " + price + " and weight: " + weight);
    }

}
