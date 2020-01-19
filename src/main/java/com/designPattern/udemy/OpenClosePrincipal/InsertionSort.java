package com.designPattern.udemy.OpenClosePrincipal;

public class InsertionSort extends Sorter {

    InsertionSort(){
        super.type=SortedType.INSERTIONSORT;
    }

    @Override
    protected void sort() {
        System.out.println("Using Insertion Sort");
    }

}
