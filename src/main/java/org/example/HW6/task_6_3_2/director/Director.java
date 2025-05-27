package org.example.HW6.task_6_3_2.director;


import org.example.HW6.task_6_3_2.builder.CarBuilder;
import org.example.HW6.task_6_3_2.car.Car;

public class Director {
    private static Director instance;
    private CarBuilder builder;

    private Director(CarBuilder builder) {
        this.builder = builder;
    }

    public static Director getInstance(CarBuilder builder) {
        if (instance == null) {
            instance = new Director(builder);
        }
        return instance;
    }

    public Car construct(String color) {
        builder.buildBody();
        builder.buildEngine();
        builder.buildTransmission();
        builder.buildWheels();
        builder.paint(color);
        return builder.getCar();
    }
}
