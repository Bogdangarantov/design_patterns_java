package org.example.HW18.task18_3_2;

public class HalveSidesCommand implements Command {
    private final Triangle triangle;

    public HalveSidesCommand(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void execute() {
        triangle.halveSides();
    }
}
