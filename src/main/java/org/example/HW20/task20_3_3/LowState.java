package org.example.HW20.task20_3_3;

public class LowState implements State {

    private final Fan fan;

    public LowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnUp() {
        System.out.println("Вентилятор працює на середній швидкості");
        fan.setState(new MediumState(fan));
    }

    @Override
    public void turnDown() {
        System.out.println("Вентилятор вже вимкнений або на мінімальній швидкості");
    }
}
