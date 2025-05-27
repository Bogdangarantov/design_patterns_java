package org.example.HW3.task3_3_1.factory;

import org.example.HW3.task3_3_1.coffee.Coffee;
import org.example.HW3.task3_3_1.coffee.Espresso;
import org.example.HW3.task3_3_1.factory.CoffeeFactory;

public class JuraFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new Espresso(); // повертаємо як Coffee
    }

    @Override
    public double getMachinePrice() {
        return 2500.0;
    }

    @Override
    public double getMaintenanceCostPerDay() {
        return 7.0;
    }
}

