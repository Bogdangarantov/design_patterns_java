package org.example.HW2.task3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CoffeeShopSimulation {
    public static void main(String[] args) {
        int min = 10;
        int max = 40;
        List<String> coffeeTypes = new ArrayList<>();
        coffeeTypes.add("Espresso");
        coffeeTypes.add("Latte");
        coffeeTypes.add("Americano");
        coffeeTypes.add("Cappuccino");
        CoffeeShop shop = new CoffeeShop();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 365; i++) {
            System.out.println("DAY "+ i+1);
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1); // Випадкова кількість кави продана за день
            System.out.println("Coffee cups by day : "+randomNum);
            for (int coffee=0;coffee<randomNum;coffee++){
                int randomCoffeeType = random.nextInt(coffeeTypes.size());
                String coffeeType = coffeeTypes.get(randomCoffeeType);
                shop.sellCoffee(coffeeType);
            }
        }
        System.out.println("Total profit By The Year: $" + shop.calculateProfit());
    }
}