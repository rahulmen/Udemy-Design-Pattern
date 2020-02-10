package com.designPattern.udemy.FactoryPattern;

public class DataBaseFactory {

    public static int SQLCOUNT=1;
    public static int ORACLECOUNT=2;

    public static DataBase getDataBase(int count){
        switch (count){
            case 1:{
                return new SQLDataBase();
            }
            case 2:{
                return new OracleDataBase();
            } default:{
                return null;
            }
        }

    }

}
