package duplicateencoder;

public class DuplicateEncoder {

    public static String encode(String text) {
        Text normalizedText = new Text(text);
        if (normalizedText.isEmpty()) {
            return "";
        }
        String encoded = "";
        for (String character: normalizedText.characters()) {
            encoded += normalizedText.isDuplicate(character) ? ")" : "(";
        }
        return encoded;
    }

}
