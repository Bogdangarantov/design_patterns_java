package org.example.HW15.task15_3_2;

public class MenuItem {
    private Command command;

    public MenuItem(Command command) {
        this.command = command;
    }

    public void select() {
        command.execute();
    }
}
