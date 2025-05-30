package org.example.HW14.task14_3_2;

public class PdfFileHandler extends FileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".pdf");
    }

    @Override
    protected void doOpen(String fileName) {
        System.out.println("Відкриваємо PDF файл: " + fileName);
    }
}
