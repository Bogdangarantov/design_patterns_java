package org.example.HW15.task15_3_1;

public class TurnOffCommand implements Command {
    private Lamp lamp;

    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}
