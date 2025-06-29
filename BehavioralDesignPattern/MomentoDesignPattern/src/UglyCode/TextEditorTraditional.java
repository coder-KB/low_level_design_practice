package MomentoDesignPattern.src.UglyCode;

public class TextEditorTraditional {
    private String text;

    public TextEditorTraditional(String text) {
        this.text = text;
    }

    public void setText(String currentText) {
        this.text = currentText;
    }

    public void undo(String previousState) {
        this.text = previousState;
    }

    public void showText() {
        System.out.println("Current text: " + this.text);
    }
}
