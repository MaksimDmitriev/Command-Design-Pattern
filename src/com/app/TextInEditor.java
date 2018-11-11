package com.app;

import java.util.Scanner;

public class TextInEditor {

    private StringBuilder stringBuilder = new StringBuilder();

    public void appendText() {
        Scanner scanner = new Scanner(System.in);
        stringBuilder.append(scanner.nextLine());
    }

    public void deleteText(int start, int end) {
        final int stringLen = stringBuilder.length();
        if (start < stringLen && end <= stringLen) {
            stringBuilder.delete(start, end);
        }
    }

    public String getText() {
        return stringBuilder.toString();
    }
}
