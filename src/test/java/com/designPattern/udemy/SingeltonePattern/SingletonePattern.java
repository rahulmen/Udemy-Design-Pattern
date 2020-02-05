package com.designPattern.udemy.SingeltonePattern;

import com.designPattern.udemy.SingletonePattern.ClassA;

public class SingletonePattern {


    public static void main(String... args){

        ClassA a = ClassA.INSTANCE;
        a.setCount(20);
        System.out.println(a.getCount());

    }

}
