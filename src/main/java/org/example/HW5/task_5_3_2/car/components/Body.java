package org.example.HW5.task_5_3_2.car.components;

public class Body implements Cloneable {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    public Body clone() {
        return new Body(type);
    }

    public String toString() {
        return "Body{" + "type='" + type + "'" + '}';
    }
}
