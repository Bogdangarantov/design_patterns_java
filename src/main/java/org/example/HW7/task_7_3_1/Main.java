package org.example.HW7.task_7_3_1;

public class Main {
    public static void main(String[] args) {
        MicroUsbPhone oldPhone = new AndroidPhone();
        UsbTypeCPhone adaptedPhone = new MicroUsbToTypeCAdapter(oldPhone);
        TypeCCharger charger = new TypeCCharger();

        charger.chargePhone(adaptedPhone);
    }
}
