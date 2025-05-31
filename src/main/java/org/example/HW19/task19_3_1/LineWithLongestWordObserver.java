package org.example.HW19.task19_3_1;

public class LineWithLongestWordObserver implements LineObserver {
    private String lineWithLongestWord = "";
    private int longestWordLength = 0;

    @Override
    public void process(String line) {
        for (String word : line.split("\s+")) {
            if (word.length() > longestWordLength) {
                longestWordLength = word.length();
                lineWithLongestWord = line;
            }
        }
    }

    @Override
    public void report() {
        System.out.println("Рядок з найдовшим словом: " + lineWithLongestWord );
    }
}
