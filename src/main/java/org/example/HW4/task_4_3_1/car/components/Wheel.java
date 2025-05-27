package org.example.HW4.task_4_3_1.car.components;

public class Wheel {
    private String material;
    private int diameter;

    public Wheel(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material='" + material + "'" +
                ", diameter=" + diameter +
                '}';
    }
}
