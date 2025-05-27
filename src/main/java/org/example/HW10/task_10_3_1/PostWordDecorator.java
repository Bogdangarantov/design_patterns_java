package org.example.HW10.task_10_3_1;

public class PostWordDecorator extends Decorator {
    private final String word;

    public PostWordDecorator(Printable wrapped, String word) {
        super(wrapped);
        this.word = word;
    }

    public void print() {
        wrapped.print();
        System.out.print(word);
    }
}
