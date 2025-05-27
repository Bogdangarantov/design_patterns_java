package org.example.HW3.task_3_3_2.factory;

import org.example.HW3.task_3_3_2.transport.Bus;
import org.example.HW3.task_3_3_2.transport.Tram;
import org.example.HW3.task_3_3_2.transport.Trolleybus;

public interface TransportFactory {
    Bus createBus();
    Tram createTram();
    Trolleybus createTrolleybus();
}
