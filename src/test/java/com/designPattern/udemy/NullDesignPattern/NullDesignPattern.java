package com.designPattern.udemy.NullDesignPattern;

import com.designPattern.udemy.NullPointerPattern.DataProvider;
import com.designPattern.udemy.NullPointerPattern.NotNullData;

public class NullDesignPattern {

    public static void main(String... args){

        DataProvider dataProvider = new DataProvider("Rahul");

        if(!dataProvider.isEmpty()) {
            dataProvider.getData();
        }

    }


}
