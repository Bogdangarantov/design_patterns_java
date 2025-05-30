package org.example.HW15.task15_3_2;

public class Shortcut {
    private Command command;

    public Shortcut(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
