package com.designPattern.udemy.VisitorPattern;

public interface ShippingItemList {

    public double getAmount(BeanBag beanBag);
    public double getAmount(Television television);

}
