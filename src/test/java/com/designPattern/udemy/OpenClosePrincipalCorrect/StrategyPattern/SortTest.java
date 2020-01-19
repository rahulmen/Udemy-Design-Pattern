package com.designPattern.udemy.OpenClosePrincipalCorrect.StrategyPattern;

public class SortTest {

    public static void main(String... args){


         SorterManager sorterManager = new SorterManager();
         sorterManager.sort(SorterType.MERGESORT);
         sorterManager.sort(SorterType.INSERTIONSORT);
    }

}
