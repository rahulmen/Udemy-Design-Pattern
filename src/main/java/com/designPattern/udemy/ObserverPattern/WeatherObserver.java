package com.designPattern.udemy.ObserverPattern;

public class WeatherObserver implements Observer {

    Subject subject;
    private int temperature;
    private int pressure;
    private int humidity;

    WeatherObserver(Subject subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        updatedInfo();
    }

    private void updatedInfo() {
        System.out.println("Temperature :"+this.temperature + " Humidity :"+this.humidity+" Pressure :"+this.pressure);
    }
}
