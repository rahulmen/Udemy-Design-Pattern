package com.designPattern.udemy.ObserverPattern1;

public class ScoreObservertest {


    public static void main(String... args){

        ESPNSport sport = new ESPNSport();
        ScoreObserver scoreObserver = new ScoreObserver(sport);

        sport.setBalls(10);
        sport.setBalls(20);
        sport.setRuns(300);

    }
}
