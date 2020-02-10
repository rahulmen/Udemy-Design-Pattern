package com.designPattern.udemy.FactoryPattern;

public class SQLDataBase implements DataBase {

    @Override
    public void execute() {
        System.out.println("SQL Connection Establish");
    }
}
