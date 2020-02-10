package com.designPattern.udemy.PracticalDemoDesignPattern.HotStarDemoDesignPattern;

import com.designPattern.udemy.PracticalExampleDesignPattern.HotStarObserverDesignPattern.HotStar;
import com.designPattern.udemy.PracticalExampleDesignPattern.HotStarObserverDesignPattern.HotStarUser;

public class HotStarDemoTest {


    public static void main(String... args){

        HotStar hotStar = new HotStar();
        HotStarUser hotStarUser = new HotStarUser(hotStar);
        HotStarUser hotStarUser1 = new HotStarUser(hotStar);

        hotStar.addSubscription("Premium Annually",999.0);

        hotStar.addSubscription("Premium Montly",199.0);

        hotStar.removeSubscriber(hotStarUser1);

        hotStar.addSubscription("Premium Weekly",99.0);

    }


}
