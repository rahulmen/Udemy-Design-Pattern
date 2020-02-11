package com.designPattern.udemy.AdapterPattern;

public class Scooter implements Vehicle {

  @Override
  public void accelerate() {
    System.out.println("Scooter is accelarating");
  }
}
