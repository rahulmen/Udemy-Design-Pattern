package com.designPattern.udemy.AdapterPattern;

public class BicycleAdapter implements Vehicle {

  Bicycle bicycle;

  BicycleAdapter(Bicycle bicycle){
    this.bicycle=bicycle;
  }

  @Override
  public void accelerate() {
    this.bicycle.run();
  }

}
