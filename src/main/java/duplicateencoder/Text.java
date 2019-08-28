package duplicateencoder;

import java.util.stream.Stream;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text.toLowerCase();
    }

    public boolean isDuplicate(String character) {
        return text.indexOf(character) != text.lastIndexOf(character);
    }

    public boolean isEmpty() {
        return text.isEmpty();
    }

    public String[] characters() {
        return text.split("");
    }

    public Stream<String> characterStream() {
        return text.chars().mapToObj(c -> String.valueOf(c));
    }
}
