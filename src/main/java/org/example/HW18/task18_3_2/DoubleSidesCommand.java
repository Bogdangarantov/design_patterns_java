package org.example.HW18.task18_3_2;

public class DoubleSidesCommand implements Command {
    private final Triangle triangle;

    public DoubleSidesCommand(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void execute() {
        triangle.doubleSides();
    }
}
