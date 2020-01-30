package com.designPattern.udemy.EssayProviderTest;

import com.designPattern.udemy.IteratorPattern1.EssayProvider;
import com.designPattern.udemy.IteratorPattern1.Iterator;

public class IteratorTest {


    public static void main(String... args){

        EssayProvider essayProvider = new EssayProvider();
        Iterator iterator = essayProvider.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }

}
