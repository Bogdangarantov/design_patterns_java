package org.example.HW10.task_10_3_1;

public abstract class Decorator implements Printable {
    protected final Printable wrapped;

    public Decorator(Printable wrapped) {
        this.wrapped = wrapped;
    }
}
