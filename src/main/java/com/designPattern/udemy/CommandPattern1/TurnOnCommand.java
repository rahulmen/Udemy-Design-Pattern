package com.designPattern.udemy.CommandPattern1;

public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOnLight();
    }
}
