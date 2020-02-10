package com.designPattern.udemy.BuilderPattern;

public class UserTest {

    public static void main(String... args){


        User user = new User.Builder("rahul","rahulmendiratta13@gmail.com").setRollNumber("20").setAge("432").build();
        System.out.println(user.toString());


    }

}
