package org.example.HW20.task20_3_3;

public class HighState implements State {

    private final Fan fan;

    public HighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnUp() {
        System.out.println("Вентилятор вже працює на максимальній швидкості");
    }

    @Override
    public void turnDown() {
        System.out.println("Вентилятор працює на середній швидкості");
        fan.setState(new MediumState(fan));
    }
}
