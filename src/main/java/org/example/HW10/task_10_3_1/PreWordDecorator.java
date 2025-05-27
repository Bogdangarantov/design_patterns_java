package org.example.HW10.task_10_3_1;

public class PreWordDecorator extends Decorator {
    private final String word;

    public PreWordDecorator(Printable wrapped, String word) {
        super(wrapped);
        this.word = word;
    }

    public void print() {
        System.out.print(word);
        wrapped.print();
    }
}
