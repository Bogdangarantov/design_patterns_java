package org.example.HW3.task_3_3_2.vehicles.volvo;

import org.example.HW3.task_3_3_2.transport.Tram;

public class VolvoTram implements Tram {
    public double getPurchaseCost() {
        return 10000000;
    }

    public double getMaintenanceCostPerKm() {
        return 25.0;
    }
}
