package org.example.HW17.task17_3_1;

public class Plane implements Component {
    private final String name;
    private Mediator mediator;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTakeoff() {
        System.out.println(name + " запитує дозвіл на зліт...");
        mediator.notify(this, "requestTakeoff");
    }

    public void takeOff() {
        System.out.println(name + " злітає...");
        mediator.notify(this, "landed");
    }
}
