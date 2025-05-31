package org.example.HW19.task19_3_1;

import java.io.*;
import java.util.*;

public class TextFileReader {
    private final List<LineObserver> observers = new ArrayList<>();

    public void addObserver(LineObserver observer) {
        observers.add(observer);
    }

    public void readFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (LineObserver observer : observers) {
                    observer.process(line);
                }
            }
        }
    }

    public void showReports() {
        for (LineObserver observer : observers) {
            observer.report();
        }
    }
}
