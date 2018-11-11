package com.app;

public class BackspaceCommand implements Command {

    private final TextInEditor textInEditor;

    public BackspaceCommand(TextInEditor textInEditor) {
        this.textInEditor = textInEditor;
    }

    @Override
    public void execute() {
        final int len = textInEditor.getText().length();
        textInEditor.deleteText(len - 1, len);
    }
}
