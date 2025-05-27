package org.example.HW4.task_4_3_1.car;

import org.example.HW4.task_4_3_1.car.components.Body;
import org.example.HW4.task_4_3_1.car.components.Engine;
import org.example.HW4.task_4_3_1.car.components.Transmission;
import org.example.HW4.task_4_3_1.car.components.Wheel;

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

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", color='" + color + "'" +
                '}';
    }
}
