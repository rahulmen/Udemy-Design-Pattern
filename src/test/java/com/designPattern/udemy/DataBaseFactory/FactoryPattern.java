package com.designPattern.udemy.DataBaseFactory;


import com.designPattern.udemy.FactoryPattern.DataBase;
import com.designPattern.udemy.FactoryPattern.DataBaseFactory;

public class FactoryPattern {


    public static void main(String... args){

        DataBase dataBase = DataBaseFactory.getDataBase(DataBaseFactory.SQLCOUNT);
        dataBase.execute();

    }
}
