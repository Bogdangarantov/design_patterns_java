package org.example.HW2.task2_3_1;

import org.example.HW2.task2_3_1.CoffeeTypes.*;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso": return new Espresso();
            case "americano": return new Americano();
            case "cappuccino": return new Cappuccino();
            case "latte": return new Latte();
            default: throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}