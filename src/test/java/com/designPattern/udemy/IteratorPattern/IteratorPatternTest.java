package com.designPattern.udemy.IteratorPattern;

public class IteratorPatternTest  {

    public static void main(String... args){

        ArrayListProvider arrayListProvider = new ArrayListProvider();
        ArrayList1 arrayList1 = arrayListProvider.getIterator();

        while(arrayList1.hasNext()){

            System.out.println(arrayList1.next().toString()+" ");

        }


    }
}
