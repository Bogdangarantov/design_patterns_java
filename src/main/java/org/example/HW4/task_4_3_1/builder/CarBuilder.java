package org.example.HW4.task_4_3_1.builder;


import org.example.HW4.task_4_3_1.car.Car;

public interface CarBuilder {
    void buildBody();
    void buildEngine();
    void buildTransmission();
    void buildWheels();
    void paint(String color);
    Car getCar();
}
