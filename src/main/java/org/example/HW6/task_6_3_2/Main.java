package org.example.HW6.task_6_3_2;


import org.example.HW6.task_6_3_2.builder.SedanCarBuilder;
import org.example.HW6.task_6_3_2.car.Car;
import org.example.HW6.task_6_3_2.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstance(new SedanCarBuilder());
        Car car = director.construct("Blue");
        System.out.println(car);
    }
}
