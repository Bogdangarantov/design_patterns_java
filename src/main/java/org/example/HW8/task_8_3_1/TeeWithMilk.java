package org.example.HW8.task_8_3_1;


public class TeeWithMilk extends Beverage {
    public TeeWithMilk(ServingStyle servingStyle) {
        super(servingStyle);
    }

    public void prepare() {
        System.out.println("Preparing tea with milk...");
    }

    public int cost() {
        return 30;
    }
}
