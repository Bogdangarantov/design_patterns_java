package org.example.HW10.task_10_3_2;

public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    public String description() {
        return beverage.description() + ", Cream";
    }

    public double cost() {
        return beverage.cost() + 5.0;
    }
}
