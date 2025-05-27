package org.example.HW1.task1_3_1;

public class CarSimulator {
    private CarBuilder carBuilder;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();
    }

    public void simulate() {
        Car car = carBuilder.buildCar("V8", 18);
        car.showCarSpecs();
    }

    public static void main(String[] args) {
        CarSimulator simulator = new CarSimulator();
        simulator.simulate();
    }
}
