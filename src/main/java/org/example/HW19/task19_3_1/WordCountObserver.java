package org.example.HW19.task19_3_1;

public class WordCountObserver implements LineObserver {
    private int wordCount = 0;

    @Override
    public void process(String line) {
        wordCount += line.split("\s+").length;
    }

    @Override
    public void report() {
        System.out.println("Загальна кількість слів у файлі: " + wordCount);
    }
}
