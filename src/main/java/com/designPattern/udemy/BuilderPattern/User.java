package com.designPattern.udemy.BuilderPattern;

public class User {

    private final String name;
    private final String emailId;
    private String age;
    private String rollNumber;
    private String surname;

    User(Builder builder){
        this.name=builder.name;
        this.emailId=builder.emailId;
        this.age=builder.age;
        this.rollNumber=builder.rollNumber;
        this.surname=builder.rollNumber;
    }


    static class Builder{

       private final String name;
       private final String emailId;
       private String age;
       private String rollNumber;
       private String surname;

       Builder(String name,String emailId){
           this.name=name;
           this.emailId=emailId;
       }

       public Builder setSurname(String surname) {
           this.surname = surname;
           return this;
       }

       public Builder setAge(String age) {
           this.age = age;
           return this;

       }

       public Builder setRollNumber(String rollNumber) {
           this.rollNumber = rollNumber;
           return this;

       }

       public User build(){
           return new User(this);
       }

   }

   public String toString(){
        return this.emailId+"_"+this.name+"_"+this.age+"_"+this.rollNumber+"_"+this.surname;
   }

}
