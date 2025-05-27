package org.example.HW8.task_8_3_1;


public class Coffee extends Beverage {
    public Coffee(ServingStyle servingStyle) {
        super(servingStyle);
    }

    public void prepare() {
        System.out.println("Preparing black coffee...");
    }

    public int cost() {
        return 30;
    }
}
