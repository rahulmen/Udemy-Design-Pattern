package com.designPattern.udemy.DependencyInversioon;

public class OracleConnector implements Connector {

    @Override
    public void connect() {
        System.out.println("Oracle Connectiom Establish");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracle Connection Disconnected");
    }
}
