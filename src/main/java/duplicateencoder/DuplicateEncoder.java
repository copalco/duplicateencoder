package duplicateencoder;

public class DuplicateEncoder {

    public String encode(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String encoded = "";
        String lowerCaseStr = str.toLowerCase();
        for (String character: str.split("")) {
            encoded += isDuplicate(character, str) ? ")" : "(";
        }
        return encoded;
    }

    private boolean isDuplicate(String character, String str) {
        return str.indexOf(character) != str.lastIndexOf(character);
    }
}
