package org.example.HW1.task3_2;

abstract class Creator {
    public abstract Product createProduct();

    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }
}