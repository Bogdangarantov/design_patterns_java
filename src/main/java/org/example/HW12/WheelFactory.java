package org.example.HW12;

import java.util.HashMap;
import java.util.Map;

public class WheelFactory {
    private static final Map<String, Wheel> cache = new HashMap<>();

    public static Wheel getWheel(String type) {
        return cache.computeIfAbsent(type, Wheel::new);
    }
}
