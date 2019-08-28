package duplicateencoder;

public class DuplicateEncoder {

    public static String encode(String text) {
        Text normalizedText = new Text(text);
        if (text.isEmpty()) {
            return "";
        }
        String encoded = "";
        String lowerCaseStr = text.toLowerCase();
        for (String character: lowerCaseStr.split("")) {
            encoded += isDuplicate(character, lowerCaseStr) ? ")" : "(";
        }
        return encoded;
    }

    private static boolean isDuplicate(String character, String str) {
        return str.indexOf(character) != str.lastIndexOf(character);
    }
}
