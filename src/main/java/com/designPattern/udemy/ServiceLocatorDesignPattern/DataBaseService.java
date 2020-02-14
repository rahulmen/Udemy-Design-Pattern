package com.designPattern.udemy.ServiceLocatorDesignPattern;

public class DataBaseService implements Service {

  public static String Name = "databaseService";

  @Override
  public String getName() {
    return DataBaseService.Name;
  }

  @Override
  public void execute() {
    System.out.println("DataBase Service Executed");
  }
}
