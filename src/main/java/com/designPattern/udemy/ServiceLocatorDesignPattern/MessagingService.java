package com.designPattern.udemy.ServiceLocatorDesignPattern;

public class MessagingService implements Service {

  public static String Name = "MessagingService";

  @Override
  public String getName() {
    return MessagingService.Name;
  }

  @Override
  public void execute() {
    System.out.println("Messaging Service Executed");
  }
}
