package org.example.HW15.task15_3_2;

public class CreateCommand implements Command {
    private Document document;

    public CreateCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.create();
    }
}
