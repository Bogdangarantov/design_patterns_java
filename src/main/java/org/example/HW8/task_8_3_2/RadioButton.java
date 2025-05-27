package org.example.HW8.task_8_3_2;


public class RadioButton extends Button {
    public RadioButton(Size size) {
        super(size);
    }

    public void draw() {
        System.out.println("Drawing a " + size.getSize() + " radio button.");
    }
}
