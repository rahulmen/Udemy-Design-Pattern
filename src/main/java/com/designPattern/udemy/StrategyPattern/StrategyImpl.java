package com.designPattern.udemy.StrategyPattern;

public class StrategyImpl implements Strategy{

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    public Strategy getStrategy(){
        return this.strategy;
    }

    @Override
    public int function(int a, int b) {
        return this.strategy.function(a,b);
    }
}
