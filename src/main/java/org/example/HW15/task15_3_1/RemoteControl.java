package org.example.HW15.task15_3_1;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void pressAll() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
