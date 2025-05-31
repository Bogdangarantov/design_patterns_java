package org.example.HW17.task17_3_2;

public interface ChatMediator {
    void registerUser(User user);
    void sendToAll(String message, User sender);
    void sendToUser(String message, User sender, String recipient);
    void sendToGroup(String message, User sender, String group);
}
