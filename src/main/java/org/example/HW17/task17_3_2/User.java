package org.example.HW17.task17_3_2;

public interface User {
    void send(String message);
    void sendTo(String message, String recipient);
    void sendToGroup(String message, String group);
    void receive(String message);
    String getName();
    String getGroup();
}
