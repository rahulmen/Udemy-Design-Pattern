package com.designPattern.udemy.StrategyPattern;

public class Multiply implements Strategy {

    @Override
    public int function(int a, int b) {
        return a*b;
    }
}
