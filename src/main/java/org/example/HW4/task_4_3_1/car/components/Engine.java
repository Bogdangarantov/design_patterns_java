package org.example.HW4.task_4_3_1.car.components;

public class Engine {
    private int horsepower;
    private double volume;
    private int torque;
    private String fuelType;

    public Engine(int horsepower, double volume, int torque, String fuelType) {
        this.horsepower = horsepower;
        this.volume = volume;
        this.torque = torque;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", volume=" + volume +
                ", torque=" + torque +
                ", fuelType='" + fuelType + "'" +
                '}';
    }
}
