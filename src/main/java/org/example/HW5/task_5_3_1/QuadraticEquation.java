package org.example.HW5.task_5_3_1;

public class QuadraticEquation implements Equation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Equation clone() {
        return new QuadraticEquation(a, b, c);
    }

    public String getRepresentation() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }
}
