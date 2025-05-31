package org.example.HW18.task18_3_1;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (!isValid(a, b, c)) throw new IllegalArgumentException("Неприпустимий трикутник");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setSides(double a, double b, double c) {
        if (!isValid(a, b, c)) {
            System.out.println("Неможливо змінити сторони, трикутник буде невалідним.");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public Memento save() {
        return new TriangleSnapshot(a, b, c);
    }

    public void restore(Memento m) {
        if (m instanceof TriangleSnapshot snap) {
            this.a = snap.a;
            this.b = snap.b;
            this.c = snap.c;
        }
    }

    public interface Memento {}

    // Внутрішній клас-знімок
    private static class TriangleSnapshot implements Memento {
        private final double a, b, c;

        public TriangleSnapshot(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Трикутник: a=" + a + ", b=" + b + ", c=" + c + ", площа=" + area();
    }
}
