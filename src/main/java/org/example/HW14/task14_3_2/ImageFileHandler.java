package org.example.HW14.task14_3_2;

public class ImageFileHandler extends FileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }

    @Override
    protected void doOpen(String fileName) {
        System.out.println("Відкриваємо зображення: " + fileName);
    }
}
