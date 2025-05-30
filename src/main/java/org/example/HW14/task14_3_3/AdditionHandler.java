package org.example.HW14.task14_3_3;

public class AdditionHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("+");
    }

    @Override
    protected void doOperation(double a, double b) {
        System.out.println("+ Результат: " + (a + b));
    }
}
