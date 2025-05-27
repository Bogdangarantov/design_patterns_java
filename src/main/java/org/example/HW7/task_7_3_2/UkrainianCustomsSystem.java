package org.example.HW7.task_7_3_2;

public interface UkrainianCustomsSystem {
    double calculatePriceUAH(String model, int age, int mileage, double damageLevel);
    double calculateDutyUAH(double priceUAH);
    double calculateTotalUAH(String model, int age, int mileage, double damageLevel);
}
