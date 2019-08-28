package duplicateencoder;

import java.util.stream.Stream;

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
        Stream<String> characterStream = normalizedText.characterStream();
        return characterStream.map(c -> encode(c, normalizedText)).reduce("", String::concat);
    }

    private static String encode(String character, Text normalizedText) {
        return normalizedText.isDuplicate(character) ? ")" : "(";
    }

}
