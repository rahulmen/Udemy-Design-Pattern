package com.designPattern.udemy.FacadePattern;

public class SortingManager {

    Sorting sort;

    SortingManager(Sorting sort){
        this.sort=sort;
    }

    public void sort(){
        this.sort.sort();
    }

}
