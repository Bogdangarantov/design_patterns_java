package org.example.HW3.task_3_3_2.calc;

import org.example.HW3.task_3_3_2.factory.TransportFactory;
import org.example.HW3.task_3_3_2.transport.Bus;
import org.example.HW3.task_3_3_2.transport.Tram;
import org.example.HW3.task_3_3_2.transport.Trolleybus;

public class TransportCostCalculator {
    private final TransportFactory factory;
    private final int busCount;
    private final int tramCount;
    private final int trolleybusCount;
    private final double distanceInKm;

    public TransportCostCalculator(TransportFactory factory, int busCount, int tramCount, int trolleybusCount, double distanceInKm) {
        this.factory = factory;
        this.busCount = busCount;
        this.tramCount = tramCount;
        this.trolleybusCount = trolleybusCount;
        this.distanceInKm = distanceInKm;
    }

    public double calculateTotalCost() {
        Bus bus = factory.createBus();
        Tram tram = factory.createTram();
        Trolleybus trolleybus = factory.createTrolleybus();

        double totalPurchaseCost = busCount * bus.getPurchaseCost()
                + tramCount * tram.getPurchaseCost()
                + trolleybusCount * trolleybus.getPurchaseCost();

        double totalMaintenanceCost = busCount * bus.getMaintenanceCostPerKm() * distanceInKm
                + tramCount * tram.getMaintenanceCostPerKm() * distanceInKm
                + trolleybusCount * trolleybus.getMaintenanceCostPerKm() * distanceInKm;

        return totalPurchaseCost + totalMaintenanceCost;
    }
}
