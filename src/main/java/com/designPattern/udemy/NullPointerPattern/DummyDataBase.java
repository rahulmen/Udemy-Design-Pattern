package com.designPattern.udemy.NullPointerPattern;

import java.util.ArrayList;
import java.util.List;

public class DummyDataBase {

    private List<String> data;

    DummyDataBase(){
        this.data =new ArrayList<>();
        data.add("Rahul");
        data.add("Mendiratta");
        data.add("is");
        data.add("my");
        data.add("Name");
    }

    public boolean hasName(String name){

        for(String s:data){
            if(s.equals(name)){
                return true;
            }
        }
        return false;
    }


}
