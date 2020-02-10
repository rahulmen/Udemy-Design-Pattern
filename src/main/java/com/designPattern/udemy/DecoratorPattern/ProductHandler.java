package com.designPattern.udemy.DecoratorPattern;

public class ProductHandler implements Product {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Base Product";
    }
}
