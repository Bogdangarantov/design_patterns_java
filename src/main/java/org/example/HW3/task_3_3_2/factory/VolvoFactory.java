package org.example.HW3.task_3_3_2.factory;

import org.example.HW3.task_3_3_2.vehicles.volvo.VolvoBus;
import org.example.HW3.task_3_3_2.vehicles.volvo.VolvoTram;
import org.example.HW3.task_3_3_2.vehicles.volvo.VolvoTrolleybus;
import org.example.HW3.task_3_3_2.transport.Bus;
import org.example.HW3.task_3_3_2.transport.Tram;
import org.example.HW3.task_3_3_2.transport.Trolleybus;

public class VolvoFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new VolvoBus();
    }

    @Override
    public Tram createTram() {
        return new VolvoTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus();
    }
}
