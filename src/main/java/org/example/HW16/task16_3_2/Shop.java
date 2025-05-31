package org.example.HW16.task16_3_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Shop {
    private final List<ShopItem> items = new ArrayList<>();

    public void addItem(ShopItem item) {
        items.add(item);
    }

    public Iterator<ShopItem> iteratorByName() {
        List<ShopItem> sorted = new ArrayList<>(items);
        sorted.sort(Comparator.comparing(ShopItem::name, String.CASE_INSENSITIVE_ORDER));
        return sorted.iterator();
    }

    public Iterator<ShopItem> iteratorByQuantityDesc() {
        List<ShopItem> sorted = new ArrayList<>(items);
        sorted.sort((a, b) -> Integer.compare(b.quantity(), a.quantity()));
        return sorted.iterator();
    }
}
