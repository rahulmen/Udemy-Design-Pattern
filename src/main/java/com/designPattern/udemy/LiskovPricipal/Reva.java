package com.designPattern.udemy.LiskovPricipal;

public class Reva implements ElectricVehicle {

    @Override
    public void vehicleName() {
        System.out.println("Its a Reva Vehicle");
    }

    @Override
    public void chargeType() {
        System.out.println("Its a Vehicle which charges");
    }
}
