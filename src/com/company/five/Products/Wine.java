package com.company.five.Products;

public class Wine extends Product{
 double volume;
 final double tax2 = 0.1;

    @Override
    public double product() {
        price = this.basicPrice + (basicPrice * (tax + tax2));
        return price;
    }

    public Wine(String name,int barCode, double basicPrice, double volume){
        super(name,barCode,basicPrice);
        this.volume=volume;
    }
    public void cijena() {
        System.out.println("The product named: " + this.name + ", bar-code: " + this.barCode + ", basic price: "
                + this.basicPrice  + ", price with tax " + price + " and volume: " + volume);
    }
}
