package com.designPattern.udemy.OpenClosePrincipal;

public class MergeSort extends Sorter{

    MergeSort(){
        super.type=SortedType.MERGESORT;
    }

    @Override
    protected void sort() {
        System.out.println("Using Merge Sort");
    }
}
