package com.app;

public class PrintCommand implements Command {

    private final TextInEditor textInEditor;

    public PrintCommand(TextInEditor textInEditor) {
        this.textInEditor = textInEditor;
    }

    @Override
    public void execute() {
        System.out.println(textInEditor.getText());
    }
}
