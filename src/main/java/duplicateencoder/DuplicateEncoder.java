package duplicateencoder;

public class DuplicateEncoder {

    public static String encode(String text) {
        Text normalizedText = new Text(text);
        if (normalizedText.isEmpty()) {
            return "";
        }
        String encoded = "";
        String lowerCaseStr = text.toLowerCase();
        for (String character: normalizedText.characters()) {
            encoded += normalizedText.isDuplicate(character, lowerCaseStr) ? ")" : "(";
        }
        return encoded;
    }

}
