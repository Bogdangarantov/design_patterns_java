package org.example.HW1.task1_3_2;

class ConcreteCreator2 extends Creator {
    @Override
    public Product createProduct() {
        return new Product2();
    }
}