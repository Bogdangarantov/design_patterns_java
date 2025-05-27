package org.example.HW5.task_5_3_2.car.components;

public class Transmission implements Cloneable {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public Transmission clone() {
        return new Transmission(type, gears);
    }

    public String toString() {
        return "Transmission{" + "type='" + type + "'" + ", gears=" + gears + '}';
    }
}
