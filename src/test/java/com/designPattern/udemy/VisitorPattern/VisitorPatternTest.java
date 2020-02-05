package com.designPattern.udemy.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternTest {

    public static void main(String... args){

        List<ShoppingItem> list = new ArrayList<>();
        list.add(new BeanBag("Bean Bag 1",30.0));
        list.add(new Television("Television 1",40.0));
        list.add(new Television("Television 2",50.0));

        double sum =0;

        ShippingItemList shippingItem = new ShippingItem();

        for(ShoppingItem item:list){
            sum = sum + item.buy(shippingItem);
        }

        System.out.println(sum);
    }

}
