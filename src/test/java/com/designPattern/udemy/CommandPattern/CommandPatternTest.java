package com.designPattern.udemy.CommandPattern;

import com.designPattern.udemy.CommandPattern1.*;

public class CommandPatternTest {


    public static void main(String... args){

        Switcher switcher = new Switcher();
        Light light = new Light();
        switcher.addCommand(new TurnOffCommand(light));
        switcher.addCommand(new TurnOnCommand(light));
        switcher.executeCommands();
    }

}
