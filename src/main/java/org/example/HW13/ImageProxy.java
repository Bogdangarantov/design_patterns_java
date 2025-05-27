package org.example.HW13;

public class ImageProxy implements DisplayObject {
    private final String filename;
    private ImageFile realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new ImageFile(filename);
        }
        realImage.display();
    }
}
