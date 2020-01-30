package com.designPattern.udemy.TemplatePattern;

import java.util.Arrays;

public class MergeSort extends Sort {

   private int[] arr;

    public MergeSort(int[] arr){
        this.arr=arr;
    }

    @Override
    void initailize() {
        System.out.println("Sorting started");
    }

    @Override
    void performsort() {
        Arrays.sort(arr);
    }

    @Override
    void finialize() {
       for(int arr1:arr){
           System.out.print(arr1+" ");
       }
    }
}
