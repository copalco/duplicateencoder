package duplicateencoder;

public class DuplicateEncoder {

    public static String encode(String text) {
        Text normalizedText = new Text(text);
        return normalizedText.characterStream()
                .map(character -> encode(character, normalizedText))
                .reduce("", String::concat);
    }

    private static String encode(String character, Text normalizedText) {
        return normalizedText.isDuplicate(character) ? ")" : "(";
    }

}
