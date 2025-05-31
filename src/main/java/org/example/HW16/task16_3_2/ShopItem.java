package org.example.HW16.task16_3_2;

public record ShopItem(String name, int quantity) {

    @Override
    public String toString() {
        return name + " (кількість: " + quantity + ")";
    }
}
