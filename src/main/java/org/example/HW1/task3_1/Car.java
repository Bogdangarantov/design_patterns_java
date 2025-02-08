package org.example.HW1.task3_1;

public class Car {

    private Engine engine;
    private Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void showCarSpecs() {
        System.out.println("Car with engine: " + engine.getType() + " and wheel size: " + wheel.getSize());
    }
}
