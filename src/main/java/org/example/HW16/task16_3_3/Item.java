package org.example.HW16.task16_3_3;

import java.util.Collections;
import java.util.List;

public record Item(String name, double price) implements Component {

    @Override
    public List<Component> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return name + " (₴" + price + ")";
    }
}
