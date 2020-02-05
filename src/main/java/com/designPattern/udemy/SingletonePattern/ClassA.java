package com.designPattern.udemy.SingletonePattern;

public enum ClassA {

    INSTANCE;

    int count=0;

    public int getCount(){
        return this.count;
    }

    public void setCount(int count){
        this.count=count;
    }

}
