package org.example.HW14.task14_3_2;

public class Client {
    public static void main(String[] args) {
        FileHandler handler = new TextFileHandler();
        handler.setNext(new ImageFileHandler())
               .setNext(new PdfFileHandler());

        handler.open("document.txt");
        handler.open("image.png");
        handler.open("book.pdf");
        handler.open("archive.zip");
    }
}
