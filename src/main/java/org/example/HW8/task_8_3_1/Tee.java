package org.example.HW8.task_8_3_1;


public class Tee extends Beverage {
    public Tee(ServingStyle servingStyle) {
        super(servingStyle);
    }

    public void prepare() {
        System.out.println("Preparing tea...");
    }

    public int cost() {
        return 25;
    }
}
