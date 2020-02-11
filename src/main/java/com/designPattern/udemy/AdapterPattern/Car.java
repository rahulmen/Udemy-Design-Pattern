package com.designPattern.udemy.AdapterPattern;

public class Car implements Vehicle {

  @Override
  public void accelerate() {
    System.out.println("car is accelarating");
  }
}
