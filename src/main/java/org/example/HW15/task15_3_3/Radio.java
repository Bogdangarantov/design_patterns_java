package org.example.HW15.task15_3_3;

public class Radio implements Device {
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " увімкнено");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " вимкнено");
    }

    @Override
    public String getName() {
        return name;
    }
}
