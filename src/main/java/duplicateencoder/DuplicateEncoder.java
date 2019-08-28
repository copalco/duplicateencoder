package duplicateencoder;

public class DuplicateEncoder {

    public static String encode(String text) {
        Text normalizedText = new Text(text);
        if (normalizedText.isEmpty()) {
            return "";
        }
        return encode(normalizedText);
    }

    private static String encode(Text normalizedText) {
        String encoded = "";
        for (String character: normalizedText.characters()) {
            encoded += encode(character, normalizedText);
        }
        return encoded;
    }

    private static String encode(String character, Text normalizedText) {
        return normalizedText.isDuplicate(character) ? ")" : "(";
    }

}
