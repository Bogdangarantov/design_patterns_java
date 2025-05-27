package org.example.HW6.task_6_3_1;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextFileReader reader = TextFileReader.getInstance();
//        System.out.println("Current working dir: " + System.getProperty("user.dir"));
        try {
            List<String> lines = reader.readFile("src/main/java/org/example/HW6/task_6_3_1/sample.txt");
            System.out.println("Lines: " + reader.countLines(lines));
            System.out.println("Words: " + reader.countWords(lines));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
