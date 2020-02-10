package com.designPattern.udemy.DecoratorPattern1;

public class Milk extends ProductImpl {

    Milk(Product product){
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice()+10;
    }

    @Override
    public String getDesciption() {
        return this.product.getDesciption()+"\t"+"Milk";
    }
}
