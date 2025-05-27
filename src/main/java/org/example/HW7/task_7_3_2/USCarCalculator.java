package org.example.HW7.task_7_3_2;

public class USCarCalculator {
    public double calculatePrice(String model, int age, int mileage, double damageLevel) {
        double basePrice = 30000;
        basePrice -= age * 1000;
        basePrice -= mileage * 0.05;
        basePrice -= damageLevel * 5000;
        return basePrice;
    }
}
