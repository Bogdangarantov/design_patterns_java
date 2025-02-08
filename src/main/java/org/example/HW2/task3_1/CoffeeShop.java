package org.example.HW2.task3_1;

import org.example.HW2.task3_1.CoffeeTypes.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private final List<Coffee> soldCoffees = new ArrayList<>();

    public void sellCoffee(String type) {
        Coffee coffee = CoffeeFactory.createCoffee(type);
        soldCoffees.add(coffee);
        System.out.println("Sold: " + coffee.getName());
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (Coffee coffee : soldCoffees) {
            totalProfit += (coffee.getSellingPrice() - coffee.getCostPrice());
        }
        return totalProfit;
    }
}