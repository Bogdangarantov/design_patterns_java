package org.example.HW6.task_6_3_2.car;


import org.example.HW6.task_6_3_2.car.components.*;

public class Car {
    private Body body;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;

    public void setBody(Body body) {
        this.body = body;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{" + "body=" + body + ", engine=" + engine + ", transmission=" + transmission + ", wheels=" + wheels + ", color='" + color + "'" + '}';
    }
}
