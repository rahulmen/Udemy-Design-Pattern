package com.designPattern.udemy.FacadePattern;

public class FacadePatternTest {

    public static void main(String[] args) {


        SortingManager sortingManager = new SortingManager(new MergeSort());
        sortingManager.sort();
    }

}
