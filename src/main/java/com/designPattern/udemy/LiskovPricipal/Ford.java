package com.designPattern.udemy.LiskovPricipal;

import com.designPattern.udemy.LiskovPricipal.FuelVehicle;

public class Ford implements FuelVehicle {


    @Override
    public void vehicleName() {
        System.out.println("Its a Ford Vehicle");
    }

    @Override
    public void fuelType() {
        System.out.println("Its a Vehicle which takes fuel");
    }
}
