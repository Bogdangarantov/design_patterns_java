package org.example.HW7.task_7_3_1;

public class AndroidPhone implements MicroUsbPhone {
    private boolean connector;

    public void useMicroUsb() {
        connector = true;
        System.out.println("MicroUSB connected.");
    }

    public void recharge() {
        if (connector) {
            System.out.println("Recharging via MicroUSB...");
        } else {
            System.out.println("Connect MicroUSB first.");
        }
    }
}
