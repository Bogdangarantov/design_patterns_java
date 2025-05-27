package org.example.HW3.task_3_3_2.vehicles.skoda;

import org.example.HW3.task_3_3_2.transport.Tram;

public class SkodaTram implements Tram {
    public double getPurchaseCost() {
        return 9500000;
    }

    public double getMaintenanceCostPerKm() {
        return 23.0;
    }
}