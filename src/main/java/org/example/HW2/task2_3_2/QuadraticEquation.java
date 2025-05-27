package org.example.HW2.task2_3_2;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation extends Equation {

    public QuadraticEquation(double[] coefficients) {
        super(coefficients);
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();
        if (coefficients.length == 3) {
            double a = coefficients[0];
            double b = coefficients[1];
            double c = coefficients[2];
            double discriminant = b * b - 4 * a * c;

            if (a == 0) {
                return solutions;
            }

            if (discriminant > 0) {
                solutions.add((-b + Math.sqrt(discriminant)) / (2 * a));
                solutions.add((-b - Math.sqrt(discriminant)) / (2 * a));
            } else if (discriminant == 0) {
                solutions.add(-b / (2 * a));
            }
        }
        return solutions;
    }
}
