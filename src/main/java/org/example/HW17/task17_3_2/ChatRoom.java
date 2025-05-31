package org.example.HW17.task17_3_2;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();

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

    @Override
    public void sendToGroup(String message, User sender, String groupName) {
        for (User user : users) {
            if (!user.equals(sender) && user.getGroup().equalsIgnoreCase(groupName)) {
                user.receive("від " + sender.getName() + " (до групи): " + message);
            }
        }
    }
}
