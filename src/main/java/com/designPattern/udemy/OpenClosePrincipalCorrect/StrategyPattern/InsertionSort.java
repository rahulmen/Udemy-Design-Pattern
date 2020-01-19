package com.designPattern.udemy.OpenClosePrincipalCorrect.StrategyPattern;

public class InsertionSort implements Sorter {

    @Override
    public void sort() {
      System.out.println("Using Insertion Sort");
    }
}
