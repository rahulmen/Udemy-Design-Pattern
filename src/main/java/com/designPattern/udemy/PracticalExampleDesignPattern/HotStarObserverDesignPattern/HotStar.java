package com.designPattern.udemy.PracticalExampleDesignPattern.HotStarObserverDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotStar implements Subscription {

    List<User> userList;

    Map<String,Double> map = new HashMap<>();

    public HotStar(){
        this.userList = new ArrayList<>();
    }

    @Override
    public void addSubscriber(User user) {
        this.userList.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        this.userList.remove(user);
    }

    @Override
    public void notifyAllSubscriber(Map<String,Double> map) {

        for(User user:userList){
            user.update(map);
        }

    }

    public void addSubscription(String plan,Double price){
        map.put(plan,price);
        notifyAllSubscriber(map);
    }

}
