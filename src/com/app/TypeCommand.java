package com.app;

public class TypeCommand implements Command {

    private final TextInEditor textInEditor;

    public TypeCommand(TextInEditor textInEditor) {
        this.textInEditor = textInEditor;
    }

    @Override
    public void execute() {
        textInEditor.appendText();
    }
}
