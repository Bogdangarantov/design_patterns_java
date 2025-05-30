package org.example.HW15.task15_3_1;

public class Lamp {
    private String name;

    public Lamp(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " увімкнено");
    }

    public void turnOff() {
        System.out.println(name + " вимкнено");
    }

    public String getName() {
        return name;
    }
}
