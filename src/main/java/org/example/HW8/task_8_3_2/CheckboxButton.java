package org.example.HW8.task_8_3_2;


public class CheckboxButton extends Button {
    public CheckboxButton(Size size) {
        super(size);
    }

    public void draw() {
        System.out.println("Drawing a " + size.getSize() + " checkbox button.");
    }
}
