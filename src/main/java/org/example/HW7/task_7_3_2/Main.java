package org.example.HW7.task_7_3_2;

public class Main {
    public static void main(String[] args) {
        USCarCalculator usCalculator = new USCarCalculator();
        UkrainianCustomsSystem customs = new CalculatorAdapter(usCalculator);

        String model = "Toyota Camry";
        int age = 5;
        int mileage = 80000;
        double damage = 0.2;

        double priceUAH = customs.calculatePriceUAH(model, age, mileage, damage);
        double duty = customs.calculateDutyUAH(priceUAH);
        double total = customs.calculateTotalUAH(model, age, mileage, damage);

        System.out.println("Ціна в гривнях: " + priceUAH);
        System.out.println("Мито: " + duty);
        System.out.println("Загальна вартість: " + total);
    }
}
