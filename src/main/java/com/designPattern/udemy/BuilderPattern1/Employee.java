package com.designPattern.udemy.BuilderPattern1;

public class Employee {

    private final String name;
    private final String email;
    private int age;
    private double salary;

    Employee(Builder builder){
        this.name=builder.name;
        this.email=builder.email;
        this.age=builder.age;
        this.salary=builder.salary;
    }

    static class Builder{

        private final String name;
        private final String email;
        private int age;
        private double salary;

        Builder(String name,String email){
            this.name=name;
            this.email=email;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee execute(){
            return new Employee(this);
        }
    }

    @Override
    public String toString(){
        return this.name+" "+this.email+" "+this.age+" "+this.salary;
    }

}
