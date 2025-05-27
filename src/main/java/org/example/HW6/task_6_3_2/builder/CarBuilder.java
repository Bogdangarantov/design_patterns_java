package org.example.HW6.task_6_3_2.builder;


import org.example.HW6.task_6_3_2.car.Car;

public interface CarBuilder {
    void buildBody();
    void buildEngine();
    void buildTransmission();
    void buildWheels();
    void paint(String color);
    Car getCar();
}
