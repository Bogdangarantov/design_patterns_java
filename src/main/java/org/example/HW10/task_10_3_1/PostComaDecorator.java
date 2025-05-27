package org.example.HW10.task_10_3_1;

public class PostComaDecorator extends Decorator {
    public PostComaDecorator(Printable wrapped) {
        super(wrapped);
    }

    public void print() {
        wrapped.print();
        System.out.print(",");
    }
}
