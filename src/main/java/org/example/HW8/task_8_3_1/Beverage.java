package org.example.HW8.task_8_3_1;


public abstract class Beverage {
    protected ServingStyle servingStyle;

    public Beverage(ServingStyle servingStyle) {
        this.servingStyle = servingStyle;
    }

    public abstract void prepare();

    public void serve() {
        servingStyle.serve(getClass().getSimpleName());
    }

    public abstract int cost();
}
