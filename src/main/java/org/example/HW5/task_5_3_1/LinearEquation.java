package org.example.HW5.task_5_3_1;

public class LinearEquation implements Equation {
    private double a;
    private double b;

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Equation clone() {
        return new LinearEquation(a, b);
    }

    public String getRepresentation() {
        return a + "x + " + b + " = 0";
    }
}
