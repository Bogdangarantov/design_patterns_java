package org.example.HW16.task16_3_3;

import java.util.List;

public interface Component {
    String name();
    double price();
    List<Component> getChildren();  // Empty for Item
}
