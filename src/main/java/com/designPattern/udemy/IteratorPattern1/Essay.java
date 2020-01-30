package com.designPattern.udemy.IteratorPattern1;

public class Essay implements Iterator {

    int index;
    String[] words;

    Essay(String[] words){
        this.words=words;
    }

    @Override
    public boolean hasNext() {
        return this.index<this.words.length;
    }

    @Override
    public Object next() {
        return this.words[index++];
    }
}
