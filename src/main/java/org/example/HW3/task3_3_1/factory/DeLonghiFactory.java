package org.example.HW3.task3_3_1.factory;

import org.example.HW3.task3_3_1.coffee.Cappuccino;
import org.example.HW3.task3_3_1.coffee.Coffee;
import org.example.HW3.task3_3_1.factory.CoffeeFactory;

public class DeLonghiFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }

    @Override
    public double getMachinePrice() {
        return 1800.0;
    }

    @Override
    public double getMaintenanceCostPerDay() {
        return 5.0;
    }
}
