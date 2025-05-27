package org.example.HW3.task3_3_1.shop;

import org.example.HW3.task3_3_1.factory.DeLonghiFactory;
import org.example.HW3.task3_3_1.factory.JuraFactory;

public class CoffeeShopSimulation {
    public static void main(String[] args) {
        int days = 365;
        int cupsPerDay = 30;

        CoffeeShop juraShop = new CoffeeShop(new JuraFactory(), days);
        juraShop.sellCoffee(cupsPerDay);
        System.out.println("Jura profit: $" + juraShop.calculateProfit());

        CoffeeShop deLonghiShop = new CoffeeShop(new DeLonghiFactory(), days);
        deLonghiShop.sellCoffee(cupsPerDay);
        System.out.println("DeLonghi profit: $" + deLonghiShop.calculateProfit());
    }
}
