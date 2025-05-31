package org.example.HW17.task17_3_2;

public class Client {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User admin = new ConcreteUser("Адмін", "admin", chat);
        User mod = new ConcreteUser("Модератор", "moderator", chat);
        User user1 = new ConcreteUser("Користувач1", "user", chat);
        User user2 = new ConcreteUser("Користувач2", "user", chat);

        chat.registerUser(admin);
        chat.registerUser(mod);
        chat.registerUser(user1);
        chat.registerUser(user2);

        admin.send("Привіт усім!");
        user1.sendTo("Привіт, адмініне!", "Адмін");
        mod.sendToGroup("Це повідомлення для користувачів!", "user");
    }
}
