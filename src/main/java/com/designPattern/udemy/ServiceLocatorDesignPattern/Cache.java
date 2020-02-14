package com.designPattern.udemy.ServiceLocatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {

  public List<Service> serviceList;

  Cache(){
    serviceList = new ArrayList<>();
  }


  public void addService(Service service){
    this.serviceList.add(service);
  }

  public Service getService(String service){

    for(Service service1:serviceList){
      if(service.equals(service1.getName())){
        return service1;
      }
    }
    return null;
  }


}
