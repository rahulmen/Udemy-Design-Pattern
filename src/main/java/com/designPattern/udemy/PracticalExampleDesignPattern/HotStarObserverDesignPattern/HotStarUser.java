package com.designPattern.udemy.PracticalExampleDesignPattern.HotStarObserverDesignPattern;

import com.designPattern.udemy.ObserverPattern.Subject;

import java.util.HashMap;
import java.util.Map;

public class HotStarUser implements User{

    Subscription subscription;
    Map<String,Double> plans = new HashMap<>();

    public HotStarUser(Subscription subscription){
        this.subscription=subscription;
        this.subscription.addSubscriber(this);
    }

    @Override
    public void update(Map<String,Double> map) {
        plans = map;
        updatedInfo();
    }

    private void updatedInfo() {

        System.out.println(plans);

    }
}
