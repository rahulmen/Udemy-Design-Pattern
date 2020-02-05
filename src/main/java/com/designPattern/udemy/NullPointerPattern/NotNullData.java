package com.designPattern.udemy.NullPointerPattern;

public class NotNullData extends AbstractData{

    private DummyDataBase dummyDataBase;
    private String name;

    NotNullData(String name){
        this.dummyDataBase=new DummyDataBase();
        this.name=name;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String getData() {
        if(this.dummyDataBase.hasName(name)){
            return name;
        }else{
            return new NullData().getData();
        }
    }


}
