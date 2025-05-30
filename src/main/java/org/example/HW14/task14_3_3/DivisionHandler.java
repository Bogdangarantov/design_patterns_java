package org.example.HW14.task14_3_3;

public class DivisionHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("/");
    }

    @Override
    protected void doOperation(double a, double b) {
        if (b == 0) {
            System.out.println("Помилка Ділення на нуль");
        } else {
            System.out.println("/ Результат: " + (a / b));
        }
    }
}
