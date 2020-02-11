package com.designPattern.udemy.BuilderPattern1;

public class EmployeTest {


    public static void main(String... args){

        Employee employee = new Employee.Builder("Rahul","rahulmendiratta13@gmail.com").setAge(27).setSalary(16.0).execute();

        System.out.println(employee.toString());
    }

}
