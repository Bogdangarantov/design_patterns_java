package org.example.HW2.task2_3_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Equation> loadEquationsFromFile(String fileName) throws IOException {
        System.out.println(fileName);
        List<Equation> equations = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.trim().split("\\s+");
            double[] coefficients = Arrays.stream(tokens)
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            Equation equation;
            if (coefficients.length == 2) {
                equation = new Equation(coefficients);
            } else if (coefficients.length == 3) {
                equation = new QuadraticEquation(coefficients);
            } else {
                equation = new BiQuadraticEquation(coefficients);
            }
            equations.add(equation);
        }
        reader.close();

        return equations;
    }
    public static void solve(List<Equation> equations){

        double minSolution = Double.MAX_VALUE;
        double maxSolution = Double.MIN_VALUE;

        for (Equation equation : equations) {
            List<Double> solutions = equation.solve();
            if (!solutions.isEmpty()) {
                if (solutions.contains(Double.NaN)) {
//                    System.out.println("Рівняння має нескінченну кількість рішень.");
                } else {
//                    System.out.println("Рішення рівняння: " + solutions);
                    if (solutions.size() == 1) {
                        double solution = solutions.get(0);
                        minSolution = Math.min(minSolution, solution);
                        maxSolution = Math.max(maxSolution, solution);
                    }
                }
            }
        }

        System.out.println("Найменше розв'язання: " + minSolution);
        System.out.println("Найбільше розв'язання: " + maxSolution);
    }
    public static void main(String[] args) throws IOException {
        solve(loadEquationsFromFile("src/main/java/org/example/HW2/task3_2/input01.txt"));
        solve(loadEquationsFromFile("src/main/java/org/example/HW2/task3_2/input02.txt"));
        solve(loadEquationsFromFile("src/main/java/org/example/HW2/task3_2/input03.txt"));


    }
}
