package org.example.HW4.task_4_3_1;

import org.example.HW4.task_4_3_1.builder.SedanCarBuilder;
import org.example.HW4.task_4_3_1.car.Car;
import org.example.HW4.task_4_3_1.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new SedanCarBuilder());
        Car sedan = director.constructSedan("Black");
        System.out.println(sedan);
    }
}
