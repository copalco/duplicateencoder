package duplicateencoder;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text.toLowerCase();
    }

    public boolean isEmpty() {
        return text.isEmpty();
    }
}
