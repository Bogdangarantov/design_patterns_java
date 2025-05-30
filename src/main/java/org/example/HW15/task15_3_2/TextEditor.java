package org.example.HW15.task15_3_2;

public class TextEditor {
    private Document document;

    public TextEditor(String documentName) {
        this.document = new Document(documentName);
    }

    public Button getCreateButton() {
        return new Button(new CreateCommand(document));
    }

    public MenuItem getSaveMenu() {
        return new MenuItem(new SaveCommand(document));
    }

    public Shortcut getPrintShortcut() {
        return new Shortcut(new PrintCommand(document));
    }
}
