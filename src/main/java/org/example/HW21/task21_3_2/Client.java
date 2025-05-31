package org.example.HW21.task21_3_2;

public class Client {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setOperation(new Addition());
        System.out.println("Сума: " + calc.calculate(10, 5));

        calc.setOperation(new Subtraction());
        System.out.println("Різниця: " + calc.calculate(10, 5));

        calc.setOperation(new Multiplication());
        System.out.println("Добуток: " + calc.calculate(10, 5));
    }
}