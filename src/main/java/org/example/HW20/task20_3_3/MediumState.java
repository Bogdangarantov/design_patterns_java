package org.example.HW20.task20_3_3;

public class MediumState implements State {

    private final Fan fan;

    public MediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnUp() {
        System.out.println("Вентилятор працює на максимальній швидкості");
        fan.setState(new HighState(fan));
    }

    @Override
    public void turnDown() {
        System.out.println("Вентилятор працює на мінімальній швидкості");
        fan.setState(new LowState(fan));
    }
}
