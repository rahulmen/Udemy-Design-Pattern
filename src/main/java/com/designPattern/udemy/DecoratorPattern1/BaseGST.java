package com.designPattern.udemy.DecoratorPattern1;

public class BaseGST implements Product {

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public String getDesciption() {
        return "GST Added";
    }
}
