package org.example.HW10.task_10_3_1;

public class PostSpaceDecorator extends Decorator {
    public PostSpaceDecorator(Printable wrapped) {
        super(wrapped);
    }

    public void print() {
        wrapped.print();
        System.out.print(" ");
    }
}
