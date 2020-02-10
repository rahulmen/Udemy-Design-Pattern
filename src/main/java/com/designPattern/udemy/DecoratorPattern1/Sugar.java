package com.designPattern.udemy.DecoratorPattern1;

public class Sugar extends ProductImpl {

    Sugar(Product product){
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice()+4;
    }

    @Override
    public String getDesciption() {
        return this.product.getDesciption()+"\t"+"Sugar";
    }
}
