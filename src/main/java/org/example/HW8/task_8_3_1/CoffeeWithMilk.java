package org.example.HW8.task_8_3_1;


public class CoffeeWithMilk extends Beverage {
    public CoffeeWithMilk(ServingStyle servingStyle) {
        super(servingStyle);
    }

    public void prepare() {
        System.out.println("Preparing coffee with milk...");
    }

    public int cost() {
        return 35;
    }
}
