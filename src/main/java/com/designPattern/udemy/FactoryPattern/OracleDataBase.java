package com.designPattern.udemy.FactoryPattern;

public class OracleDataBase implements DataBase {

    @Override
    public void execute() {
        System.out.println("Oracle Connection Establish");

    }
}
