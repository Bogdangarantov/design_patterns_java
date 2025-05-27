package org.example.HW3.task_3_3_2.factory;

import org.example.HW3.task_3_3_2.vehicles.hyundai.HyundaiBus;
import org.example.HW3.task_3_3_2.vehicles.hyundai.HyundaiTram;
import org.example.HW3.task_3_3_2.vehicles.hyundai.HyundaiTrolleybus;
import org.example.HW3.task_3_3_2.transport.Bus;
import org.example.HW3.task_3_3_2.transport.Tram;
import org.example.HW3.task_3_3_2.transport.Trolleybus;

public class HyundaiFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }
}
