package com.designPattern.udemy.CommandPattern1;

import java.util.ArrayList;
import java.util.List;

//invoker
public class Switcher {

    private List<Command> commandList;

    public Switcher(){
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commandList.add(command);
    }

    public void executeCommands(){

        for(Command command : commandList){
            command.execute();
        }

    }



}
