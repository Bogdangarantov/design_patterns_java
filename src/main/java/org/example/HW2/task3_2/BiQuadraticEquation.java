package org.example.HW2.task3_2;

import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation {

    public BiQuadraticEquation(double[] coefficients) {
        super(coefficients);
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();
        if (coefficients.length == 5) {
            double a = coefficients[0];
            double b = coefficients[2];
            double c = coefficients[4];

            QuadraticEquation quadratic = new QuadraticEquation(new double[]{a, b, c});
            List<Double> roots = quadratic.solve();

            for (Double root : roots) {
                if (root >= 0) {
                    solutions.add(Math.sqrt(root));
                    solutions.add(-Math.sqrt(root));
                }
            }
        }
        return solutions;
    }
}
