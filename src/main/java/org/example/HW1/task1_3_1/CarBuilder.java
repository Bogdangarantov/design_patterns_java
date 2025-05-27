package org.example.HW1.task1_3_1;

public class CarBuilder {
    public Car buildCar(String engineType, int wheelSize) {
        Engine engine = new Engine(engineType);
        Wheel wheel = new Wheel(wheelSize);
        return new Car(engine, wheel);
    }
}
