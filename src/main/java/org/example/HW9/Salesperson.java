package org.example.HW9;

public class Salesperson implements Employee {
    private String name;

    public Salesperson(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses() {
        System.out.println("Paying expenses to salesperson " + name);
    }
}
