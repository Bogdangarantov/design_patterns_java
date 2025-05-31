package org.example.HW20.task20_3_3;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnUp();   // середня
        fan.turnUp();   // максимальна
        fan.turnDown(); // середня
        fan.turnDown(); // мінімальна
        fan.turnDown(); // вже мінімальна
        fan.turnUp();   // середня
        fan.turnUp();   // максимальна
        fan.turnUp();   // вже максимальна
    }
}
