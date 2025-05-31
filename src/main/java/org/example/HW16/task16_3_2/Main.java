package org.example.HW16.task16_3_2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addItem(new ShopItem("Кава", 50));
        shop.addItem(new ShopItem("Чай", 70));
        shop.addItem(new ShopItem("Цукор", 30));
        shop.addItem(new ShopItem("Печиво", 40));

        System.out.println("Товари за алфавітом:");
        Iterator<ShopItem> nameIterator = shop.iteratorByName();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        System.out.println("\nТовари за спаданням кількості:");
        Iterator<ShopItem> quantityIterator = shop.iteratorByQuantityDesc();
        while (quantityIterator.hasNext()) {
            System.out.println(quantityIterator.next());
        }
    }
}
