package org.example.HW14.task14_3_3;

public class CalculatorClient {
    public static void main(String[] args) {
        OperationHandler handler = new AdditionHandler();
        handler.setNext(new SubtractionHandler())
               .setNext(new MultiplicationHandler())
               .setNext(new DivisionHandler());

        handler.handle(5, 3, "+");
        handler.handle(5, 3, "-");
        handler.handle(5, 3, "*");
        handler.handle(5, 0, "/");
        handler.handle(5, 3, "%"); // непідтримувана операція
    }
}
