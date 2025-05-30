package org.example.HW14.task14_3_3;

public abstract class OperationHandler {
    private OperationHandler next;

    public OperationHandler setNext(OperationHandler next) {
        this.next = next;
        return next;
    }

    public void handle(double a, double b, String operation) {
        if (canHandle(operation)) {
            doOperation(a, b);
        } else if (next != null) {
            next.handle(a, b, operation);
        } else {
            System.out.println("Операцію не підтримано: " + operation);
        }
    }

    protected abstract boolean canHandle(String operation);
    protected abstract void doOperation(double a, double b);
}
