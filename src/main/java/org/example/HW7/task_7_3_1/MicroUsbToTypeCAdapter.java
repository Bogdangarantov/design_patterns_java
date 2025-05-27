package org.example.HW7.task_7_3_1;

public class MicroUsbToTypeCAdapter implements UsbTypeCPhone {
    private final MicroUsbPhone phone;

    public MicroUsbToTypeCAdapter(MicroUsbPhone phone) {
        this.phone = phone;
    }

    public void useUsbTypeC() {
        System.out.println("Adapter converts USB Type-C to MicroUSB.");
        phone.useMicroUsb();
    }

    public void recharge() {
        phone.recharge();
    }
}
