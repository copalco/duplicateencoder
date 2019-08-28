package duplicateencoder;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text.toLowerCase();
    }

    static boolean isDuplicate(String character, String str) {
        return str.indexOf(character) != str.lastIndexOf(character);
    }

    public boolean isEmpty() {
        return text.isEmpty();
    }

    public String[] characters() {
        return text.split("");
    }
}
