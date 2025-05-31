package org.example.HW17.task17_3_1;

public class Main {
    public static void main(String[] args) {
        FlightControlMediator mediator = new FlightControlMediator();

        Runway runway = new Runway();
        mediator.registerRunway(runway);

        Plane plane1 = new Plane("Boeing-737");
        Plane plane2 = new Plane("Airbus-A320");
        Plane plane3 = new Plane("AN-225");

        mediator.registerPlane(plane1);
        mediator.registerPlane(plane2);
        mediator.registerPlane(plane3);

        plane1.requestTakeoff();
        plane2.requestTakeoff();
        plane3.requestTakeoff();
    }
}
