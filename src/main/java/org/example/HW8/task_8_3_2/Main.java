package org.example.HW8.task_8_3_2;


public class Main {
    public static void main(String[] args) {
        Button smallCheckbox = new CheckboxButton(new Small());
        Button mediumRadio = new RadioButton(new Medium());
        Button largeDropdown = new DropdownButton(new Large());
        Button userImage = new ImageButton(new UserSize("Extra-Wide"));

        smallCheckbox.draw();
        mediumRadio.draw();
        largeDropdown.draw();
        userImage.draw();
    }
}
