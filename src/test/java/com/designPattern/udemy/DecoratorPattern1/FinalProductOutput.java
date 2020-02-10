package com.designPattern.udemy.DecoratorPattern1;

public class FinalProductOutput {


    public static void main(String... args){

        Product product = new Milk(new Milk(new Sugar(new Sugar(new Sugar(new Milk(new BaseGST()))))));

        System.out.println(product.getPrice());
        System.out.println(product.getDesciption());

    }

}
