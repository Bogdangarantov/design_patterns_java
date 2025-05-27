package org.example.HW3.task3_3_1.factory;

import org.example.HW3.task3_3_1.coffee.*;

public interface CoffeeFactory {
    Coffee createCoffee();
    double getMachinePrice();
    double getMaintenanceCostPerDay();
}