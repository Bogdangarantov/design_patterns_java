package org.example.HW18.task18_3_1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        List<Triangle.Memento> history = new ArrayList<>();
        List<Double> areas = new ArrayList<>();

        saveState(triangle, history, areas);
        triangle.setSides(6, 8, 10);
        saveState(triangle, history, areas);
        triangle.setSides(10, 10, 10);
        saveState(triangle, history, areas);
        triangle.setSides(2, 2, 5);

        int maxIndex = 0;
        for (int i = 1; i < areas.size(); i++) {
            if (areas.get(i) > areas.get(maxIndex)) maxIndex = i;
        }

        triangle.restore(history.get(maxIndex));
        System.out.println("\nВідновлено стан з найбільшою площею:");
        System.out.println(triangle);
    }

    private static void saveState(Triangle triangle, List<Triangle.Memento> history, List<Double> areas) {
        history.add(triangle.save());
        areas.add(triangle.area());
        System.out.println("Збережено: " + triangle);
    }
}
