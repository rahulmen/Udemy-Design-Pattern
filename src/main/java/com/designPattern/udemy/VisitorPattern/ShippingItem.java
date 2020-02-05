package com.designPattern.udemy.VisitorPattern;

public class ShippingItem implements ShippingItemList {

    @Override
    public double getAmount(BeanBag beanBag) {
        return beanBag.getAmount();
    }

    @Override
    public double getAmount(Television television) {
       return television.getAmount();
    }
}
