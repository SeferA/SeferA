package com.seferari.autoclicker.command;

public class Command {
    
    private String name;


    Command(String name) {
        this.name = name;
    }

    public void readCommand()  {

    }

    public String getName() {
        return this.name;
    }
}
