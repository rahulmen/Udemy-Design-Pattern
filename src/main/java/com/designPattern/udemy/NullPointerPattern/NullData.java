package com.designPattern.udemy.NullPointerPattern;

public class NullData extends AbstractData {

    @Override
    boolean isEmpty() {
        return true;
    }

    @Override
    String getData() {
        return "Data is null";
    }
}
