package com.designPattern.udemy.DecoratorPattern;

public class ProductTest {

    public static void main(String... args){

        Product product = new Milk(new Milk(new ProductHandler()));
        int price = product.getPrice();

        System.out.println(price);
        System.out.println(product.getDescription());

    }

}

