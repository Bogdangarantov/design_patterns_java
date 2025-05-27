package org.example.HW3.task_3_3_2.vehicles.volvo;

import org.example.HW3.task_3_3_2.transport.Bus;

public class VolvoBus implements Bus {
    @Override
    public double getPurchaseCost() {
        return 6000000;
    }

    @Override
    public double getMaintenanceCostPerKm() {
        return 15.0;
    }
}
