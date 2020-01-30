package com.designPattern.udemy.CommandPattern1;

public class TurnOffCommand implements Command {

    private Light light;

    public TurnOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOffLight();
    }
}
