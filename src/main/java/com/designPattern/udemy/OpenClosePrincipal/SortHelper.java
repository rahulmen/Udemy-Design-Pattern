package com.designPattern.udemy.OpenClosePrincipal;

public class SortHelper {

    public void sort(Sorter sorter){

        if(sorter.type==SortedType.MERGESORT){
            doMergeSort(sorter);
        }else if(sorter.type==SortedType.INSERTIONSORT){
            doInsertionSort(sorter);
        }



    }

    private void doInsertionSort(Sorter sorter) {
        sorter.sort();
    }

    private void doMergeSort(Sorter sorter) {
        sorter.sort();
    }

}
