package org.example.HW8.task_8_3_2;


public class DropdownButton extends Button {
    public DropdownButton(Size size) {
        super(size);
    }

    public void draw() {
        System.out.println("Drawing a " + size.getSize() + " dropdown button.");
    }
}
