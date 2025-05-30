package org.example.HW15.task15_3_2;

public class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void create() {
        System.out.println("Документ створено: " + name);
    }

    public void save() {
        System.out.println("Документ збережено: " + name);
    }

    public void print() {
        System.out.println("Друкуємо документ: " + name);
    }
}
