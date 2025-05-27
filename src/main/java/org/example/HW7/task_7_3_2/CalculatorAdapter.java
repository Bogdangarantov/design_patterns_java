package org.example.HW7.task_7_3_2;

public class CalculatorAdapter implements UkrainianCustomsSystem {
    private final USCarCalculator calculator;
    private final double exchangeRate = 38.0;

    public CalculatorAdapter(USCarCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculatePriceUAH(String model, int age, int mileage, double damageLevel) {
        double usd = calculator.calculatePrice(model, age, mileage, damageLevel);
        return usd * exchangeRate;
    }

    public double calculateDutyUAH(double priceUAH) {
        return priceUAH * 0.25;
    }

    public double calculateTotalUAH(String model, int age, int mileage, double damageLevel) {
        double price = calculatePriceUAH(model, age, mileage, damageLevel);
        return price + calculateDutyUAH(price);
    }
}
