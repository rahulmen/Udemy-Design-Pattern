package com.designPattern.udemy.LiskovPrincipal;

import com.designPattern.udemy.LiskovPricipal.ElectricVehicle;
import com.designPattern.udemy.LiskovPricipal.Ford;
import com.designPattern.udemy.LiskovPricipal.FuelVehicle;
import com.designPattern.udemy.LiskovPricipal.Reva;

public class VehicleTest {


    public static void main(String... args){

        FuelVehicle ford = new Ford();
        ford.fuelType();
        ford.vehicleName();
        ElectricVehicle electricVehicle = new Reva();
        electricVehicle.chargeType();
        electricVehicle.chargeType();

    }


}
