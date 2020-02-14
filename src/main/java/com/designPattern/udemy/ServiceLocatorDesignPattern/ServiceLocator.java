package com.designPattern.udemy.ServiceLocatorDesignPattern;

public class ServiceLocator {

  Cache cache = new Cache();


  public void getService(String name){

    Service service = cache.getService(name);

    if(service!=null){
      service.execute();
      return;
    }

    Service service1 = ServiceInitializer.getService(name);
    service1.execute();
    cache.addService(service1);

  }

}
