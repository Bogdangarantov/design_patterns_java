package org.example.HW3.task_3_3_2.vehicles.hyundai;

import org.example.HW3.task_3_3_2.transport.Bus;

public class HyundaiBus implements Bus {
    public double getPurchaseCost() {
        return 5500000;
    }

    public double getMaintenanceCostPerKm() {
        return 13.5;
    }
}