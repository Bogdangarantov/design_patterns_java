package org.example.HW3.task_3_3_2.factory;

import org.example.HW3.task_3_3_2.vehicles.skoda.SkodaBus;
import org.example.HW3.task_3_3_2.vehicles.skoda.SkodaTram;
import org.example.HW3.task_3_3_2.vehicles.skoda.SkodaTrolleybus;
import org.example.HW3.task_3_3_2.transport.Bus;
import org.example.HW3.task_3_3_2.transport.Tram;
import org.example.HW3.task_3_3_2.transport.Trolleybus;

public class SkodaFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new SkodaBus();
    }

    @Override
    public Tram createTram() {
        return new SkodaTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }
}
