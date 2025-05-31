package org.example.HW19.task19_3_1;

public class LongestLineObserver implements LineObserver {
    private String longestLine = "";

    @Override
    public void process(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    @Override
    public void report() {
        System.out.println("Найдовший рядок: " + longestLine + " (довжина: " + longestLine.length() + ")");
    }
}
