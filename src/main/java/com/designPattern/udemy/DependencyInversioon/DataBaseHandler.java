package com.designPattern.udemy.DependencyInversioon;

public class DataBaseHandler {

    private Connector connector;

    public DataBaseHandler(Connector connector){
        this.connector=connector;
    }

    public void connect(){
        this.connector.connect();
    }

    public void disconnect(){
        this.connector.disconnect();
    }
}
