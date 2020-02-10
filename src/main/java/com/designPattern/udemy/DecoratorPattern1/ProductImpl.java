package com.designPattern.udemy.DecoratorPattern1;

public abstract class ProductImpl implements Product {

    protected Product product;

    ProductImpl(Product product){
        this.product=product;
    }

    @Override
    public int getPrice() {
        return this.product.getPrice();
    }

    @Override
    public String getDesciption() {
        return this.product.getDesciption();
    }


}
