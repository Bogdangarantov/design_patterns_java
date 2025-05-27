package org.example.HW12;

public class CarBuilder {
    public Car buildCar(String engineModel, String wheelType) {
        Engine engine = EngineFactory.getEngine(engineModel);
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = WheelFactory.getWheel(wheelType);
        }
        return new Car(engine, wheels);
    }
}
