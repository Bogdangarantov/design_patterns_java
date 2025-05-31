package org.example.HW17.task17_3_2;

public class ConcreteUser implements User {
    private final String name;
    private final String group;
    private final ChatMediator mediator;

    public ConcreteUser(String name, String group, ChatMediator mediator) {
        this.name = name;
        this.group = group;
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
    public void sendToGroup(String message, String group) {
        System.out.println("[" + name + " -> група " + group + "]: " + message);
        mediator.sendToGroup(message, this, group);
    }

    @Override
    public void receive(String message) {
        System.out.println("Сповіщення " + name + " отримав повідомлення: " + message);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGroup() {
        return group;
    }
}
