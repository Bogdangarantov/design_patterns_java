package org.example.HW14.task14_3_2;

public class TextFileHandler extends FileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".txt");
    }

    @Override
    protected void doOpen(String fileName) {
        System.out.println("Відкриваємо текстовий файл: " + fileName);
    }
}
