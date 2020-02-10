package com.designPattern.udemy.DecoratorPattern;

import java.util.HashMap;
import java.util.TreeSet;

public class Milk extends ProductImpl {

    private Product product;

    public Milk(Product product){
        super(product);
        this.product=product;
    }

    @Override
    public int getPrice() {
        return this.product.getPrice()+3;
    }

    @Override
    public String getDescription() {
        return this.product.getDescription()+"\t"+"Milk"+"\t";
    }


}
