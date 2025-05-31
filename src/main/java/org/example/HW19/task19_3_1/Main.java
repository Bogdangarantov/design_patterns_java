package org.example.HW19.task19_3_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();
        reader.addObserver(new LongestLineObserver());
        reader.addObserver(new LongestWordObserver());
        reader.addObserver(new WordCountObserver());
        reader.addObserver(new LineWithLongestWordObserver());

        try {
            reader.readFile("src/main/resources/HW19/input01.txt");
            reader.showReports();
        } catch (IOException e) {
            System.err.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}
