package org.example.HW8.task_8_3_1;

public class MilkChocolate extends Beverage {
    public MilkChocolate(ServingStyle servingStyle) {
        super(servingStyle);
    }

    public void prepare() {
        System.out.println("Preparing milk chocolate...");
    }

    public int cost() {
        return 40;
    }
}
