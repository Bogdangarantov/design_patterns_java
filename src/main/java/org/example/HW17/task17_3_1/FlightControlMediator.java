package org.example.HW17.task17_3_1;

import java.util.ArrayList;
import java.util.List;

public class FlightControlMediator implements Mediator {
    private Runway runway;
    private final List<Plane> planes = new ArrayList<>();

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerPlane(Plane plane) {
        planes.add(plane);
        plane.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof Plane plane) {
            if (event.equals("requestTakeoff")) {
                if (runway.isAvailable()) {
                    System.out.println(plane.getName() + " дозволено зліт.");
                    runway.setAvailable(false);
                    plane.takeOff();
                } else {
                    System.out.println("Злітна смуга зайнята. " + plane.getName() + " чекає.");
                }
            } else if (event.equals("landed")) {
                System.out.println(plane.getName() + " приземлився.");
                runway.setAvailable(true);
            }
        }
    }
}
