package BDP_10_MomentoDesignPattern.src.GoodCode;

public class MomentoDemo {
    public static void main(String[] args) {
        EditorHistory editorHistory = new EditorHistory();

        TextEditor textEditor = new TextEditor("Hello");
        System.out.println("Current State: " + textEditor.getText());

        editorHistory.push(textEditor.save());

        textEditor.setText("Hello World");
        System.out.println("Current State: " + textEditor.getText());

        editorHistory.push(textEditor.save());

        textEditor.setText("Hello World, Welcome to Momento Design Pattern");
        System.out.println("Current State: " + textEditor.getText());

        Momento previousState = editorHistory.pop();
        textEditor.restore(previousState);
        System.out.println("Current State: " + textEditor.getText());

        previousState = editorHistory.pop();
        textEditor.restore(previousState);
        System.out.println("Current State: " + textEditor.getText());
    }
}
