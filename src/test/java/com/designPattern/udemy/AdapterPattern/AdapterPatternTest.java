package com.designPattern.udemy.AdapterPattern;

public class AdapterPatternTest {

  public static void main(String[] args) {

    Vehicle vehicle = new Car();
    vehicle.accelerate();

    Vehicle vehicle1 = new Scooter();
    vehicle1.accelerate();

    BicycleAdapter bicycleAdapter = new BicycleAdapter(new Bicycle());
    bicycleAdapter.accelerate();

  }


}
