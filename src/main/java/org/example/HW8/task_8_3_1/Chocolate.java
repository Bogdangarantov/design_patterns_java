package org.example.HW8.task_8_3_1;


public class Chocolate extends Beverage {
    public Chocolate(ServingStyle servingStyle) {
        super(servingStyle);
    }

    public void prepare() {
        System.out.println("Preparing chocolate...");
    }

    public int cost() {
        return 35;
    }
}
