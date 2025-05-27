package org.example.HW5.task_5_3_2.car.components;

public class Wheel implements Cloneable {
    private String material;
    private int diameter;

    public Wheel(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public Wheel clone() {
        return new Wheel(material, diameter);
    }

    public String toString() {
        return "Wheel{" + "material='" + material + "'" + ", diameter=" + diameter + '}';
    }
}
