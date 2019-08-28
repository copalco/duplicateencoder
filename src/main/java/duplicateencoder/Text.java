package duplicateencoder;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text.toLowerCase();
    }

    public boolean isDuplicate(String character, String str) {
        return text.indexOf(character) != text.lastIndexOf(character);
    }

    public boolean isEmpty() {
        return text.isEmpty();
    }

    public String[] characters() {
        return text.split("");
    }
}
