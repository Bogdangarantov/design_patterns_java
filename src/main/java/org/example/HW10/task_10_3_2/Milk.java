package org.example.HW10.task_10_3_2;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String description() {
        return beverage.description() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 4.0;
    }
}
