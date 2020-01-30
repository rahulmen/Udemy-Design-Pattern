package com.designPattern.udemy.ObserverPattern1;

public class ScoreObserver implements Observer {

    private Subject subject;

    ScoreObserver(Subject subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int runs, int balls) {
        System.out.println("Current Balls :"+runs + "Current Score"+balls);
    }
}
