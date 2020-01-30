package com.designPattern.udemy.IteratorPattern1;

public class EssayProvider {

    String words = "My Name is Rahul Mendiratta";

    public Essay getIterator(){
        return new Essay(words.split(" "));
    }

}
