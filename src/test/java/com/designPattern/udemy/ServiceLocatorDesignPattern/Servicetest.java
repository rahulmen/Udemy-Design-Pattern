package com.designPattern.udemy.ServiceLocatorDesignPattern;

public class Servicetest {


  public static void main(String[] args) {

    ServiceLocator serviceLocator = new ServiceLocator();
    serviceLocator.getService(DataBaseService.Name);
    serviceLocator.getService(DataBaseService.Name);

  }
}
