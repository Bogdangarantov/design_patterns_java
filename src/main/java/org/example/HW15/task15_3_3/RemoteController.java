package org.example.HW15.task15_3_3;

import java.util.ArrayList;
import java.util.List;

public class RemoteController {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void pressPowerOffAll() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
