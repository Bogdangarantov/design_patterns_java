package org.example.HW3.task3_3_1.shop;

import org.example.HW3.task3_3_1.factory.CoffeeFactory;
import org.example.HW3.task3_3_1.coffee.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private final List<Coffee> soldCoffees = new ArrayList<>();
    private final CoffeeFactory factory;
    private final int days;

    public CoffeeShop(CoffeeFactory factory, int days) {
        this.factory = factory;
        this.days = days;
    }

    public void sellCoffee(int cupsPerDay) {
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < cupsPerDay; j++) {
                Coffee coffee = factory.createCoffee();
                soldCoffees.add(coffee);
            }
        }
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (Coffee coffee : soldCoffees) {
            totalProfit += coffee.getSellingPrice() - coffee.getCostPrice();
        }

        double machineCost = factory.getMachinePrice();
        double maintenance = factory.getMaintenanceCostPerDay() * days;

        return totalProfit - machineCost - maintenance;
    }
}
