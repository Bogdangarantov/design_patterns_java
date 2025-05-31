package org.example.HW17.task17_2_3;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void sendToAll(String message, User sender) {
        for (User user : users) {
            if (!user.equals(sender)) {
                user.receive("від " + sender.getName() + ": " + message);
            }
        }
    }

    @Override
    public void sendToUser(String message, User sender, String recipientName) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(recipientName)) {
                user.receive("від " + sender.getName() + ": " + message);
                break;
            }
        }
    }
}
