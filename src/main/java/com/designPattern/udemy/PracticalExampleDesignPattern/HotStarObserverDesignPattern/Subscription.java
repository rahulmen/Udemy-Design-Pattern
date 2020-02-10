package com.designPattern.udemy.PracticalExampleDesignPattern.HotStarObserverDesignPattern;

import java.util.Map;

public interface Subscription {

    void addSubscriber(User user);
    void removeSubscriber(User user);
    void notifyAllSubscriber(Map<String,Double> map);

}
