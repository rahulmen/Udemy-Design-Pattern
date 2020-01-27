package com.designPattern.udemy.DependencyInversioon;

import java.util.logging.Logger;

public class MySQLConnector implements Connector {

    @Override
    public void connect() {
        System.out.println("MySql Connectiom Establish");
    }

    @Override
    public void disconnect() {
        System.out.println("MySql Connection Disconnected");
    }
}
