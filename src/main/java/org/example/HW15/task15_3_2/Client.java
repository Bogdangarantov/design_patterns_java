package org.example.HW15.task15_3_2;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("report.docx");

        Button createButton = editor.getCreateButton();
        MenuItem saveMenu = editor.getSaveMenu();
        Shortcut printShortcut = editor.getPrintShortcut();

        System.out.println("Натискаємо кнопку 'Створити'");
        createButton.click();

        System.out.println("\nВибір пункту меню 'Зберегти'");
        saveMenu.select();

        System.out.println("\nНатискаємо комбінацію клавіш 'Ctrl+P'");
        printShortcut.press();
    }
}
