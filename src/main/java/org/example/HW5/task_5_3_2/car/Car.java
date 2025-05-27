package org.example.HW5.task_5_3_2.car;

import org.example.HW5.task_5_3_2.car.components.Body;
import org.example.HW5.task_5_3_2.car.components.Engine;
import org.example.HW5.task_5_3_2.car.components.Transmission;
import org.example.HW5.task_5_3_2.car.components.Wheel;

public class Car implements Cloneable {
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

    public Car clone() {
        Car clone = new Car();
        clone.setBody(body.clone());
        clone.setEngine(engine.clone());
        clone.setTransmission(transmission.clone());
        clone.setWheels(wheels.clone());
        clone.setColor(color);
        return clone;
    }

    public String toString() {
        return "Car{" + "body=" + body + ", engine=" + engine + ", transmission=" + transmission + ", wheels=" + wheels + ", color='" + color + "'" + '}';
    }
}
