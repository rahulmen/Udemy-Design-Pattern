package com.designPattern.udemy.TemplatePattern;

public abstract class Sort {

    abstract void initailize();
    abstract void performsort();
    abstract void finialize();

    public void sort(){
        initailize();
        performsort();
        finialize();
    }

}
