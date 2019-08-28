package duplicateencoder;

public class DuplicateEncoder {

    public static String encode(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String encoded = "";
        String lowerCaseStr = str.toLowerCase();
        for (String character: lowerCaseStr.split("")) {
            encoded += isDuplicate(character, lowerCaseStr) ? ")" : "(";
        }
        return encoded;
    }

    private static boolean isDuplicate(String character, String str) {
        return str.indexOf(character) != str.lastIndexOf(character);
    }
}
