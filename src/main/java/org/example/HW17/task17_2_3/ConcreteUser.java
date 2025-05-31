package org.example.HW17.task17_2_3;

public class ConcreteUser implements User {
    private String name;
    private ChatMediator mediator;

    public ConcreteUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        System.out.println("[" + name + " -> всі]: " + message);
        mediator.sendToAll(message, this);
    }

    @Override
    public void sendTo(String message, String recipient) {
        System.out.println("[" + name + " -> " + recipient + "]: " + message);
        mediator.sendToUser(message, this, recipient);
    }

    @Override
    public void receive(String message) {
        System.out.println("Сповіщення " + name + " отримав повідомлення: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}
