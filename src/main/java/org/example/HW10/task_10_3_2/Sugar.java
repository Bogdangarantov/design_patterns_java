package org.example.HW10.task_10_3_2;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public String description() {
        return beverage.description() + ", Sugar";
    }

    public double cost() {
        return beverage.cost() + 2.0;
    }
}
