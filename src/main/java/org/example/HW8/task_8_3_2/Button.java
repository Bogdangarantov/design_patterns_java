package org.example.HW8.task_8_3_2;


public abstract class Button {
    protected Size size;

    public Button(Size size) {
        this.size = size;
    }

    public abstract void draw();
}
