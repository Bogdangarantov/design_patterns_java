package org.example.HW5.task_5_3_2;


import org.example.HW5.task_5_3_2.car.Car;
import org.example.HW5.task_5_3_2.car.components.Body;
import org.example.HW5.task_5_3_2.car.components.Engine;
import org.example.HW5.task_5_3_2.car.components.Transmission;
import org.example.HW5.task_5_3_2.car.components.Wheel;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBody(new Body("Sedan"));
        car1.setEngine(new Engine(150, 1.8, 180, "Petrol"));
        car1.setTransmission(new Transmission("automatic", 6));
        car1.setWheels(new Wheel("alloy", 17));
        car1.setColor("Black");

        Car car2 = car1.clone();

        System.out.println(car1);
        System.out.println(car2);
    }
}
