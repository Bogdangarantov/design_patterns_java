package org.example.HW16.task16_3_3;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private final String name;
    private final List<Component> components = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return components.stream().mapToDouble(Component::price).sum();
    }

    @Override
    public List<Component> getChildren() {
        return components;
    }

    @Override
    public String toString() {
        return "Коробка: " + name;
    }
}
