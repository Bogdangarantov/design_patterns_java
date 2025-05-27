package org.example.HW8.task_8_3_2;


public class ImageButton extends Button {
    public ImageButton(Size size) {
        super(size);
    }

    public void draw() {
        System.out.println("Drawing a " + size.getSize() + " image button with icon.");
    }
}
