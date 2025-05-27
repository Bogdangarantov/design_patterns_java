package org.example.HW8.task_8_3_2;

public class UserSize implements Size {
    private final String description;

    public UserSize(String description) {
        this.description = description;
    }

    public String getSize() {
        return description;
    }
}
