package org.example.HW14.task14_3_2;

public abstract class FileHandler {
    private FileHandler next;

    public FileHandler setNext(FileHandler next) {
        this.next = next;
        return next;
    }

    public void open(String fileName) {
        if (canHandle(fileName)) {
            doOpen(fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Немає обробника для файлу: " + fileName);
        }
    }

    protected abstract boolean canHandle(String fileName);
    protected abstract void doOpen(String fileName);
}
