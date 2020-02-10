package com.designPattern.udemy.DecoratorPattern;

public abstract class ProductImpl implements Product {

    Product product;

    ProductImpl(Product product){
        this.product=product;
    }

    @Override
    public int getPrice() {
        return this.product.getPrice();
    }

    @Override
    public String getDescription() {
        return this.product.getDescription();
    }
}
