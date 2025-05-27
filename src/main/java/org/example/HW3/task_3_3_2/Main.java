package org.example.HW3.task_3_3_2;

import org.example.HW3.task_3_3_2.calc.TransportCostCalculator;
import org.example.HW3.task_3_3_2.factory.HyundaiFactory;
import org.example.HW3.task_3_3_2.factory.SkodaFactory;
import org.example.HW3.task_3_3_2.factory.TransportFactory;
import org.example.HW3.task_3_3_2.factory.VolvoFactory;

public class Main {
    public static void main(String[] args) {
        int busCount = 10;
        int tramCount = 5;
        int trolleybusCount = 7;
        double distanceInKm = 100000; // 100 тис. км

        TransportFactory volvoFactory = new VolvoFactory();
        TransportCostCalculator volvoCalculator = new TransportCostCalculator(volvoFactory, busCount, tramCount, trolleybusCount, distanceInKm);
        double volvoTotalCost = volvoCalculator.calculateTotalCost();
        System.out.println("Volvo Total Cost: " + volvoTotalCost);

        TransportFactory skodaFactory = new SkodaFactory();
        TransportCostCalculator skodaCalculator = new TransportCostCalculator(skodaFactory, busCount, tramCount, trolleybusCount, distanceInKm);
        double skodaTotalCost = skodaCalculator.calculateTotalCost();
        System.out.println("Skoda Total Cost: " + skodaTotalCost);

        TransportFactory hyundaiFactory = new HyundaiFactory();
        TransportCostCalculator hyundaiCalculator = new TransportCostCalculator(hyundaiFactory, busCount, tramCount, trolleybusCount, distanceInKm);
        double hyundaiTotalCost = hyundaiCalculator.calculateTotalCost();
        System.out.println("Hyundai Total Cost: " + hyundaiTotalCost);
    }
}
