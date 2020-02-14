package com.designPattern.udemy.ServiceLocatorDesignPattern;

public class ServiceInitializer {

  static Service service;

  public static Service getService(String service){

    switch (service){
      case "databaseService":{
        return new DataBaseService();
      } case "MessagingService":{
        return new MessagingService();
      } default:return  null;
    }
  }

}
