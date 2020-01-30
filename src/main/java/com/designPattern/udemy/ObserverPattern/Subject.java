package com.designPattern.udemy.ObserverPattern;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObserver();

}
