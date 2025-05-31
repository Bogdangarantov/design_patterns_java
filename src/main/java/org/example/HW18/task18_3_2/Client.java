package org.example.HW18.task18_3_2;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 8, 10);
        List<Triangle.Memento> history = new ArrayList<>();
        List<Double> areas = new ArrayList<>();

        save(triangle, history, areas);
        execute(new DoubleSidesCommand(triangle), triangle, history, areas);
        execute(new HalveSidesCommand(triangle), triangle, history, areas);
        execute(new HalveSidesCommand(triangle), triangle, history, areas);
        execute(new DoubleSidesCommand(triangle), triangle, history, areas);

        int minIndex = 0;
        for (int i = 1; i < areas.size(); i++) {
            if (areas.get(i) < areas.get(minIndex)) minIndex = i;
        }

        triangle.restore(history.get(minIndex));
        System.out.println("\nВідновлено стан з найменшою площею:");
        System.out.println(triangle);
    }

    private static void execute(Command cmd, Triangle triangle, List<Triangle.Memento> history, List<Double> areas) {
        cmd.execute();
        save(triangle, history, areas);
    }

    private static void save(Triangle triangle, List<Triangle.Memento> history, List<Double> areas) {
        history.add(triangle.save());
        areas.add(triangle.area());
        System.out.println("Стан збережено: " + triangle);
    }
}
