package org.example.HW15.task15_3_3;

public class TVSimulator {
    public static void main(String[] args) {
        Device tv = new Television("Samsung TV");
        Device radio = new Radio("Sony Radio");

        tv.turnOn();
        radio.turnOn();

        RemoteController remote = new RemoteController();
        remote.addCommand(new TurnOffCommand(tv));
        remote.addCommand(new TurnOffCommand(radio));

        System.out.println("\nНатискаємо кнопку 'Power Off All'");
        remote.pressPowerOffAll();
    }
}
