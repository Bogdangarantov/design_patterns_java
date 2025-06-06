package org.example.HW15.task15_3_1;

public class TurnOnCommand implements Command {
    private Lamp lamp;

    public TurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
