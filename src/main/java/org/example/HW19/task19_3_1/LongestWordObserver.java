package org.example.HW19.task19_3_1;

public class LongestWordObserver implements LineObserver {
    private String longestWord = "";

    @Override
    public void process(String line) {
        for (String word : line.split("\s+")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    @Override
    public void report() {
        System.out.println("Найдовше слово: " + longestWord + " (довжина: " + longestWord.length() + ")");
    }
}
