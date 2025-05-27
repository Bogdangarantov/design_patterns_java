package org.example.HW12;

import java.util.HashMap;
import java.util.Map;

public class EngineFactory {
    private static final Map<String, Engine> cache = new HashMap<>();

    public static Engine getEngine(String model) {
        return cache.computeIfAbsent(model, Engine::new);
    }
}
