package com.designPattern.udemy.StrategyPattern;

public class StrategyPatternTest {

    private static void print(int num){
        System.out.println(num);
    }

    public static void main(String... args){

        StrategyImpl strategy = new StrategyImpl();

        if(strategy.getStrategy()!=null) {
            print(strategy.function(10, 20));
        }else{
            strategy.setStrategy(new Addition());
            print(strategy.function(10,20));
        }
    }
}
