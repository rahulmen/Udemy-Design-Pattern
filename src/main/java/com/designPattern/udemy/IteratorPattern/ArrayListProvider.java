package com.designPattern.udemy.IteratorPattern;

public class ArrayListProvider {

    int[] arr = {2,4,2,2,43,5,2,1,3,-1};

   public ArrayList1 getIterator(){
       return new ArrayList1(arr);
    }
}
