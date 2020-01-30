package com.designPattern.udemy.IteratorPattern;

public class ArrayList1 implements Iterator {

    private int[] array;
    int index;

    ArrayList1(int[] array){
        this.array=array;
    }

    @Override
    public boolean hasNext() {
        return index<this.array.length;
    }

    @Override
    public Object next() {
        return this.array[index++];
    }
}
