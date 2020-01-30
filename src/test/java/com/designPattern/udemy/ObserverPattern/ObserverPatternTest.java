package com.designPattern.udemy.ObserverPattern;

public class ObserverPatternTest {

    public static void main(String... args){

        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
        WeatherObserver weatherObserver1 = new WeatherObserver(weatherStation);

        weatherStation.setHumidity(10);
        weatherStation.setPressure(20);
        weatherStation.setTemperature(40);




    }

}
