package com.designPattern.udemy.ObserverPattern1;

public interface Subject {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyAllObserver();

}
