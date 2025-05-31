package org.example.HW17.task17_2_3;

public interface User {
    void send(String message);
    void sendTo(String message, String recipient);
    void receive(String message);
    String getName();
}
