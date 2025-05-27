package org.example.HW4.task_4_3_1.car.components;

public class Transmission {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + "'" +
                ", gears=" + gears +
                '}';
    }
}
