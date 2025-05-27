package org.example.HW6.task_6_3_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextFileReader {
    private static TextFileReader instance;

    private TextFileReader() {}

    public static TextFileReader getInstance() {
        if (instance == null) {
            instance = new TextFileReader();
        }
        return instance;
    }

    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public int countLines(List<String> lines) {
        return lines.size();
    }

    public int countWords(List<String> lines) {
        return lines.stream().mapToInt(line -> line.split("\s+").length).sum();
    }
}
