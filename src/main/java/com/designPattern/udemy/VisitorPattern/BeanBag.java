package com.designPattern.udemy.VisitorPattern;

public class BeanBag implements ShoppingItem {

    public String type;
    public double amount;


    public BeanBag(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double buy(ShippingItemList shippingItemList) {
        return shippingItemList.getAmount(this);
    }
}
