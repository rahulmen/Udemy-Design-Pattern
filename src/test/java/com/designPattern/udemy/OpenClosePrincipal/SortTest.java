package com.designPattern.udemy.OpenClosePrincipal;

public class SortTest {

    public static void main(String... args){

        SortHelper sortHelper = new SortHelper();
        sortHelper.sort(new MergeSort());
        sortHelper.sort(new InsertionSort());

    }

}
