package org.example.HW17.task17_2_3;

public class Client {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User alice = new ConcreteUser("Аліса", chat);
        User bob = new ConcreteUser("Боб", chat);
        User carol = new ConcreteUser("Кароліна", chat);

        chat.registerUser(alice);
        chat.registerUser(bob);
        chat.registerUser(carol);

        alice.send("Привіт усім!");
        bob.sendTo("Привіт, Алісо!", "Аліса");
        carol.send("Гарного дня!");
    }
}
