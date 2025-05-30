package org.example.HW15.task15_3_1;

public class Client {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("Лампа у вітальні");
        Lamp lamp2 = new Lamp("Настільна лампа");
        Lamp lamp3 = new Lamp("Лампа в кухні");

        TurnOnCommand on1 = new TurnOnCommand(lamp1);
        TurnOnCommand on2 = new TurnOnCommand(lamp2);
        TurnOffCommand off1 = new TurnOffCommand(lamp1);
        TurnOffCommand off2 = new TurnOffCommand(lamp2);
        TurnOffCommand off3 = new TurnOffCommand(lamp3);

        RemoteControl remote = new RemoteControl();
        on1.execute();  // Увімкнули лампу 1
        on2.execute();  // Увімкнули лампу 2

        System.out.println("\nВимикаємо усі лампи через пульт:");
        remote.addCommand(off1);
        remote.addCommand(off2);
        remote.addCommand(off3);
        remote.pressAll();
    }
}
