package com.designPattern.udemy.DependencyInversion;

import com.designPattern.udemy.DependencyInversioon.DataBaseHandler;
import com.designPattern.udemy.DependencyInversioon.MySQLConnector;
import com.designPattern.udemy.DependencyInversioon.OracleConnector;

public class DataBaseTest {

    public static void main(String... args){

        DataBaseHandler dataBaseHandler = new DataBaseHandler(new OracleConnector());
        dataBaseHandler.connect();
        dataBaseHandler.disconnect();


    }


}
