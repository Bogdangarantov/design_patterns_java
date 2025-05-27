package org.example.HW9;

public class Manager implements Employee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses() {
        System.out.println("Paying expenses to manager " + name);
    }
}
