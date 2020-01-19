package com.designPattern.udemy.OpenClosePrincipalCorrect.StrategyPattern;

public class SorterManager {

    public void sort(SorterType sorterType){

        if(sorterType==SorterType.MERGESORT){
            Sorter sorter = new MergeSort();
            sorter.sort();
        }else{
            Sorter sorter = new InsertionSort();
            sorter.sort();
        }
    }

}
