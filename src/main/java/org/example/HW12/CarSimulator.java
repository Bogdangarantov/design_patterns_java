package org.example.HW12;

public class CarSimulator {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();

        Car car1 = builder.buildCar("V8", "All-Terrain");
        Car car2 = builder.buildCar("V8", "All-Terrain");
        Car car3 = builder.buildCar("V6", "Street");

        car1.show();
        System.out.println();
        car2.show();
        System.out.println();
        car3.show();
    }
}
