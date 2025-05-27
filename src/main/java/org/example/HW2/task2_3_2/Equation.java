package org.example.HW2.task2_3_2;

import java.util.ArrayList;
import java.util.List;

public class Equation {
    protected double[] coefficients;

    public Equation(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();
        if (coefficients.length == 2) {
            double b = coefficients[0];
            double c = coefficients[1];
            if (b != 0) {
                solutions.add(-c / b);
            } else if (c == 0) {
                solutions.add(Double.NaN);
            }
        }
        return solutions;
    }
}
