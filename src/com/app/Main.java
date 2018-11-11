package com.app;

public class Main {

    public static void main(String[] args) {
        TextInEditor textInEditor = new TextInEditor();

        Command typeCommand = new TypeCommand(textInEditor);
        typeCommand.execute();

        Command printCommand = new PrintCommand(textInEditor);
        printCommand.execute();

        Command backspaceCommand = new BackspaceCommand(textInEditor);
        backspaceCommand.execute();

        printCommand.execute();
    }
}
