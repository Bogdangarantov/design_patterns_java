package org.example.HW5.task_5_3_2.car.components;

public class Engine implements Cloneable {
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

    public Engine clone() {
        return new Engine(horsepower, volume, torque, fuelType);
    }

    public String toString() {
        return "Engine{" + "horsepower=" + horsepower + ", volume=" + volume + ", torque=" + torque + ", fuelType='" + fuelType + "'" + '}';
    }
}
