package org.example.HW6.task_6_3_2.builder;


import org.example.HW6.task_6_3_2.car.Car;
import org.example.HW6.task_6_3_2.car.components.*;

public class SedanCarBuilder implements CarBuilder {
    private Car car = new Car();

    public void buildBody() {
        car.setBody(new Body("Sedan"));
    }

    public void buildEngine() {
        car.setEngine(new Engine(150, 1.8, 180, "Petrol"));
    }

    public void buildTransmission() {
        car.setTransmission(new Transmission("automatic", 6));
    }

    public void buildWheels() {
        car.setWheels(new Wheel("alloy", 17));
    }

    public void paint(String color) {
        car.setColor(color);
    }

    public Car getCar() {
        return car;
    }
}
