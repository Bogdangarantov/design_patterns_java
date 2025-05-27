package org.example.HW4.task_4_3_1.builder;

import org.example.HW4.task_4_3_1.car.Car;
import org.example.HW4.task_4_3_1.car.components.Body;
import org.example.HW4.task_4_3_1.car.components.Engine;
import org.example.HW4.task_4_3_1.car.components.Transmission;
import org.example.HW4.task_4_3_1.car.components.Wheel;

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
