package org.example.HW5.task_5_3_1;

public class Main {
    public static void main(String[] args) {
        Equation eq1 = new LinearEquation(2, 3);
        Equation eq2 = eq1.clone();
        System.out.println(eq1.getRepresentation());
        System.out.println(eq2.getRepresentation());

        Equation eq3 = new QuadraticEquation(1, -2, 1);
        Equation eq4 = eq3.clone();
        System.out.println(eq3.getRepresentation());
        System.out.println(eq4.getRepresentation());
    }
}
