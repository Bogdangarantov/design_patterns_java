package org.example.HW4.task_4_3_1.director;

import org.example.HW4.task_4_3_1.builder.CarBuilder;
import org.example.HW4.task_4_3_1.car.Car;

public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSedan(String color) {
        builder.buildBody();
        builder.buildEngine();
        builder.buildTransmission();
        builder.buildWheels();
        builder.paint(color);
        return builder.getCar();
    }
}
