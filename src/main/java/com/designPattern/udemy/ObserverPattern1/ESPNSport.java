package com.designPattern.udemy.ObserverPattern1;

import java.util.ArrayList;
import java.util.List;

public class ESPNSport implements Subject {

    private int runs,balls;
    private List<Observer> observerList;

    ESPNSport(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
       this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {

        for(Observer observer:observerList){
            observer.update(this.runs,this.balls);
        }

    }

    public void setRuns(int runs) {
        this.runs = runs;
        notifyAllObserver();
    }

    public void setBalls(int balls) {
        this.balls = balls;
        notifyAllObserver();
    }
}
