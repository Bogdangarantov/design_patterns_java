package org.example.HW17.task17_2_3;

public interface ChatMediator {
    void registerUser(User user);
    void sendToAll(String message, User sender);
    void sendToUser(String message, User sender, String recipient);
}
