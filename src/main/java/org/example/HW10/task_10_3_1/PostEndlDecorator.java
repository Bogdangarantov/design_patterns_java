package org.example.HW10.task_10_3_1;

public class PostEndlDecorator extends Decorator {
    public PostEndlDecorator(Printable wrapped) {
        super(wrapped);
    }

    public void print() {
        wrapped.print();
        System.out.print("\n");
    }
}
