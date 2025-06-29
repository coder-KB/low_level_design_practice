package MomentoDesignPattern.src.UglyCode;

public class TraditionalEditorDemo {
    public static void main(String[] args) {
        TextEditorTraditional editor = new TextEditorTraditional("Hello");
        editor.showText();

        String backup = "Hello";
        editor.setText("Hello World");
        editor.showText();

        editor.undo(backup);
        editor.showText();
    }
}
