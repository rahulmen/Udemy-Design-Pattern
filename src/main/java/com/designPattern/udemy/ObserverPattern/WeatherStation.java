package com.designPattern.udemy.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private int temperature;
    private int pressure;
    private int humidity;
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObserver() {

        for(Observer o : observerList){
            o.update(this.pressure,this.temperature,this.humidity);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObserver();

    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObserver();
    }
}
