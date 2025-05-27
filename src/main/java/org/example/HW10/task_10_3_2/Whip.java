package org.example.HW10.task_10_3_2;

public class Whip extends BeverageDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String description() {
        return beverage.description() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 6.0;
    }
}
