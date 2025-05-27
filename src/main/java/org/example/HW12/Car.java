package org.example.HW12;

public class Car {
    private final Engine engine;
    private final Wheel[] wheels;

    public Car(Engine engine, Wheel[] wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void show() {
        System.out.println("Car with engine: " + engine.getModel());
        System.out.println("Wheels:");
        for (Wheel wheel : wheels) {
            System.out.println("- " + wheel.getType());
        }
    }
}
